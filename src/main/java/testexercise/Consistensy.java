package testexercise;

/*
нужно найти самую длинную непрерывно возрастающую последовательность чисел
саму последовательность

 */


import java.util.Arrays;

public class Consistensy {
    public static void main(String[] args) {
        Consistensy cons = new Consistensy();
        int[] set = {10, 0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
        System.out.println(Arrays.toString(cons.consistencyChecler(set)));

    }

    public class OtherClass {

    }
        public int[] consistencyChecler(int[] arr) {
            int index = 0;
            int count = 1;
            int maxCount = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i == arr.length - 1 || arr[i] > arr[i + 1]) {
                    if (maxCount < count) {
                        maxCount = count;
                        index = i + 1 - count;
                    }
                    count = 1;
                } else{
                    count++;
                }

        }
            return Arrays.copyOfRange(arr, index,index +maxCount);
        }
    }


