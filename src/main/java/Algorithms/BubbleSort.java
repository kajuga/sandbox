package Algorithms;

import java.util.Arrays;

public class BubbleSort {


    public static void main(String[] args) {

        int[] arr = {234, -1, -24, 33, 0, 65, 15};

        for (int i = arr.length - 1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }



        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }




    }

}
