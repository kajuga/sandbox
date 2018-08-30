package javagr8.arrays;

import java.util.Arrays;

public class Dispatcher {
    public static void main(String[] args) {
        int [] x = {4,3,8,5,1,7,0,2}; //0 1 2 3 4 5 7 8
        Arrays.sort(x);
        int index = Arrays.binarySearch(x, 0);
        System.out.println(index);

    }

}
// -n -1