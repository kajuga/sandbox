package itvdn.professional_2018.lesson_1;

public class Iterators {

    public static void main(String[] args) {
        int[] x = {2, 5, 6, 8, 9, 3};
        //вывод на экран элементов массива при помощи цикла for:

        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();


        //вывод на экран при помощи foreach:
        for (int tmp : x) {
            System.out.print(tmp + " ");
        }
        System.out.println();
        //изменение значения поля класса:
        for(int tmp : x) {
            ++tmp;
            System.out.print(tmp + " ");
        }
        System.out.println();

        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }
}
