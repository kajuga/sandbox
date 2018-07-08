package stepic.collections_2;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * There is a queue of 4 elements. Put in it one more element - the number 5, and then get 2 items out of the queue.
 Sample Input:

 Sample Output:

 [3, 4, 5]
 */


public class Step_5_Queue_and_Stack {
    public static void main(String[] args) {

        Deque<Integer> queue = new ArrayDeque<>(Arrays.asList(1,2,3,4));
        queue.add(5);
        queue.removeFirst();
        queue.removeFirst();


        //write your code here


        System.out.println(queue);

    }
}
