package javamentor;

import java.io.*;

/**
 * @author Fedorov Aleksandr (msg2fedorov@gmail.com)
 */
public class Calculator {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ввести выражение (arab. or roman:)");
            String[] expr = (reader.readLine()).split("\\s");
            Calculator calculator = new Calculator();
            if (expr[0].matches("[-+]?\\d+") && expr[2].matches("[-+]?\\d+")) {
                Integer result = calculator.calculation(Integer.parseInt(expr[0]), Integer.parseInt(expr[2]), expr[1]);
                System.out.print("Output: " + result);
            } else {
                Integer result = calculator.calculation(new ArabicRoman(expr[0]).toInteger(), new ArabicRoman(expr[2]).toInteger(), expr[1]);
                System.out.println("Output: " + new ArabicRoman(result));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        reader.close();
    }

    public Integer calculation(Integer a, Integer b, String op) {
        int res;
        if (op.equals("+")) {
            res = a + b;

        } else if (op.equals("-")) {
            res = a - b;

        } else if (op.equals("*")) {
            res = a * b;

        } else if (op.equals("/")) {
            res = a / b;

        } else {
            System.out.print("Ошибка в действии");
            res = 0;

        }
        return res;
    }
}