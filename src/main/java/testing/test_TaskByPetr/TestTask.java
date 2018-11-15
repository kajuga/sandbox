package testing.test_TaskByPetr;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Дан массив Integer [] arr = new Integer {1, 5, 10}
 * нужно создать из него два массива с приближенно равными значениями
 */
public class TestTask {
    public static void main(String[] args) {
        //ДАНО
        Integer[] arr = {1, 10, 5, 7, 3};

        //1. перво-наперво мне нужны 2 массива размером int = arr/2 и (если % != 0) int = arr/2 + 1
        Integer[] first;
        Integer[] second;

        //2. сортирую основной массив по возрастанию
        Arrays.sort(arr);
        for (Integer integer : arr) {
            System.out.println(integer);
        }

        if(ArrayDivider(arr) == true) {
//            Integer[] first

        }



    }


    public static boolean ArrayDivider(Integer[] arr) {
        if (arr.length % 2 == 0) {
            return true;
        }
        return false;
    }

//    public static void ArrayFiller


}