package itvdn.professional_2018.lesson_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleBufferedReader {
    public static void main(String[] args) throws IOException {
//        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
//            int num = Integer.parseInt(bufferedReader.readLine());
//            System.out.println(num);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        /**
         * Запись байтов
         */
//    int i = System.in.read();
//        System.out.println((char)i);

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        int i2 = inputStreamReader.read();
        System.out.println((char) i2);

    }
}









