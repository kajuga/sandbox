package javamentor;

import java.io.*;

public class Calculator {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Choose Arabian (1)");
        System.out.println("Choose Rome (2)");

        try {
            int chooseVar = Integer.parseInt(reader.readLine());
            System.out.println("Ввести первую цифру: ");
            String a = reader.readLine();

            System.out.println("Ввести действие (+, - , * , /): ");
            String act = reader.readLine();

            System.out.println("Ввести вторую цифру: ");
            String b = reader.readLine();

            Calculator calculator = new Calculator();
            if (chooseVar == 1) {
                Integer result = calculator.calculation(Integer.parseInt(a), Integer.parseInt(b), act);
                System.out.println(result);
            } else if (chooseVar == 2) {
                Integer result = calculator.calculation(new ArabicRoman(a).toInteger(), new ArabicRoman(b).toInteger(), act);
                System.out.println(new ArabicRoman(result));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

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