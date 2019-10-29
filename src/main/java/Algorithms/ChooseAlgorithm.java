package Algorithms;

public class ChooseAlgorithm {


    public static void main(String[] args) {
        int[] arr = {234, -1, -24, 33, 0, 65, 15};
        sorting(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void sorting(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int min = arr[i];
            int min_i = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int temp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = temp;
            }
        }
    }
}