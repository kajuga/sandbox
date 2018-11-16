package testing.test_TaskByPetr;

import java.util.Arrays;

/**
 * Дан массив Integer [] arr = new Integer {1, 5, 10}
 * нужно создать из него два массива с приближенно равными значениями
 */
public class TestTask {
    public static void main(String[] args) {
        //ДАНО
        int[] arr = {1, 10, 5, 7, 3};

        //1. перво-наперво мне нужны 2 массива размером int = arr/2 и (если % != 0) int = arr/2 + 1
        int[] first = new int[2];
        int[] second = new int[3];

        //2. сортирую основной массив по возрастанию
        Arrays.sort(arr);
        for (int integer : arr) {
            System.out.print(integer + " ");
        }
        System.out.println();
        //проверку на деление на 0 потом доделаю, размеры вместо цыфирок тоже потом, щас заплатки поставил по конкретному случаю
        if(arr.length % 2 != 0) {
            System.arraycopy(arr, 0, first, 0, 2);
            System.arraycopy(arr, arr.length / 2, second, 0, 3);
        } else {
            System.arraycopy(arr, 0, first, 0, arr.length / 2);
            System.arraycopy(arr, 0, second, 0, arr.length / 2);
        }

        System.out.println("Длина first = " + first.length);
        System.out.println("Длина second = " + second.length);
        System.out.println();
        System.out.println("Сумма чисел первого = " + ArraySummer(first));
        System.out.println("Сумма чисел ворого = " + ArraySummer(second));
    }

    //метод складывалка чисел в массиве
    public static int ArraySummer(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total;
    }


//todo кажется массивы  нужно заполнить таким образом чтоб наименьший разрыв в суммах равнялся самому маленькому числу в начальном массиве!!






//    public static void ArrayFiller


}