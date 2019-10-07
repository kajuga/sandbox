package Focus_Start;

import java.util.Arrays;

public class LargestTriangle {


    public static void main(String[] args) {
        String test = "-1 -1 10 -1 -1 10";
        String test2 = "25 0 25 25 0 25";
        LargestTriangle lt = new LargestTriangle();
        System.out.println(lt.isCorrect("25 0 25 25 0 25"));
        System.out.println(lt.area(test2));
    }



    public double area(String coordinates) {
        double temp = -1;
        double ab;
        double ac;
        double bc;
        if (isCorrect(coordinates)) {
            int x1, y1, x2, y2, x3, y3;
            double p;
            String[] subStr;
            String delimeter = " ";
            subStr = coordinates.trim().split(delimeter);

//            int[][] matrix = Arrays.stream(subStr)
//                    .map(stringRow -> Arrays.stream(stringRow.split(" "))
//                            .mapToInt(Integer::valueOf)
//                            .toArray()
//                    ).toArray(int[][]::new);

            String my_matrics[][] = new String[6][2];//declaring two dimensional matrix for input

            for(int i=0;i<s1.length;i++){
                s1[i]=s1[i].trim();//ignoring all extra space if the string s1[i] has
                String single_int[]=s1[i].split(", ");//separating integers by ", "

                for(int j=0;j<single_int.length;j++){
                    my_matrics[i][j]=single_int[j];//adding single values
                }
            }



            x1 = matrix[0][0];
            y1 = matrix[0][1];
            x2 = matrix[1][0];
            y2 = matrix[1][1];
            x3 = matrix[2][0];
            y3 = matrix[2][1];

            ab = сutLength(x1, y1, x2, y2);
            ac = сutLength(x1, y1, x3, y3);
            bc = сutLength(x2, y2, x3, y3);

            if (ab + bc > ac || ab + ac > bc || ac + bc > ab) {
                if (ab == ac || ac == bc || ab == bc) {
                    p = (сutLength(x1, y1, x2, y2)
                            + сutLength(x3, y3, x2, y2)
                            + сutLength(x1, y1, x3, y3)) /2;
                    temp =  Math.sqrt(p * (p - сutLength(x1, y1, x2, y2))
                            * (p - сutLength(x3, y3, x2, y2))
                            * (p - сutLength(x1, y1, x3, y3)));
                }
            }
        }
        return temp;
    }

//Проверка непосредственно строки на корректность - координаты или мусор (буквы, символы)
    public boolean isCorrect (String coordinates) {
        boolean checker = true;
        String[] subStr;
        String delimeter = " ";
        subStr = coordinates.trim().split(delimeter);
        if (subStr.length == 6) {
            for (int i = 0; i < subStr.length; i++) {
                if (!isNumeric(subStr[i])) {
                    return checker = false;
                }
            }
        }
        return checker;
    }
    //проверяю число или нет
    private boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }


    //расстояние между 2 точками
    public double сutLength(int x1, int y1, int x2, int y2) {
        return Math.sqrt((y2 - y1) *  (y2 - y1) + (x2 - x1) *  (x2 - x1));
    }











//        if (isNumber(coordinates)) {        }


//Проверка возможности существования треугольника (true if сумма двух сторон больше третьей)


//Вычисление площади РАВНОБЕДРЕННОГО треугольника


    }




