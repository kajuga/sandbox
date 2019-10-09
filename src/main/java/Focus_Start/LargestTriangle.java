package Focus_Start;

import java.io.*;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class LargestTriangle {

    private double maxValue;
    private String stringValue;


    public static void main(String[] args) {
        String in = args[0];
        String out = args[1];
        LargestTriangle lt = new LargestTriangle();
        lt.readFile(in);
        lt.writeFile(lt.stringValue, out);
    }

    public void readFile(String filename) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String str = null;
            while ((str = reader.readLine()) != null) {
                double area = area(str);
                if (area != 0) {
                    maxCoordinateChooser(area, str);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void maxCoordinateChooser(double area, String coordinates) {
        if (area > this.maxValue) {
            this.maxValue = area;
            this.stringValue = coordinates;
        }
    }


    //записывалка координатки в файл
    public void writeFile(String coordinates, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(coordinates == null ? "" : coordinates);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public double area(String string) {
        int x1, y1, x2, y2, x3, y3;
        try (Scanner scanner = new Scanner(new StringReader(string));) {
            x1 = scanner.nextInt();
            y1 = scanner.nextInt();
            x2 = scanner.nextInt();
            y2 = scanner.nextInt();
            x3 = scanner.nextInt();
            y3 = scanner.nextInt();
        } catch (IllegalStateException| NoSuchElementException ex) {
            return 0;
        }
        //вычисляю длину сторон-отрезков ab,bc,ac
        double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        double b = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        double c = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        //условие существования треугольника в принципе (чтоб существовал, сумма 2-х сторон дожна быть строго больше 3-ей)
        if (a + b <= c || b + c <= a || a + c <= b) {
            return 0;
            //проверяю равенство любых 2-х сторон
        } else if ((a == b) || (a == c) || (b == c)) {
            double p = (a + b + c) / 2.0;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return 0;
    }

}









