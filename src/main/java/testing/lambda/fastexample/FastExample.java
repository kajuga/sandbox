package testing.lambda.fastexample;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FastExample {


    public static void main(String[] args) {
        int[] arr = {-5, -4, -3, -2, -1, 1, 2, 3, 4, 5, 6};

        Printer pr = (s) -> System.out.println(s);
        pr.print("Печатаю S");
//        Arrays.sort(arr);
//        for (int i : arr) {
//            System.out.println(i);
//        }
        Compute cmp = (int x) -> x >5;
        System.out.println(summer(arr, cmp));

    }



    public static int summer(int[] arr, Compute comp) {
    int result = 0;
    for (int i : arr) {
        if (comp.computing(i)) {
            result += i;
        }
    }
    return result;
    }
}





