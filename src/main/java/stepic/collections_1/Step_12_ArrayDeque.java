package stepic.collections_1;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * Create ArrayDeque by name queue in any way known to you and push the following four numbers 2, 0, 1, 7 .
 The code for displaying the queue is already written.

 Sample Output:
 [2, 0, 1, 7]
 */

public class Step_12_ArrayDeque {
    public static void main(String[] args) {

        Deque <Integer> queue = new ArrayDeque <>();
        queue.add(2);
        queue.add(0);
        queue.add(1);
        queue.add(7);

        //или так
        Deque<Integer> queue2 = new ArrayDeque<>(Arrays.asList(2, 0, 1, 7));

        //или так
        int[] digits = {2, 0, 1, 7};
        ArrayDeque<Integer> queue3 = new ArrayDeque<>(4);
        Arrays.stream(digits).forEach(digit -> queue3.add(digit));


        System.out.println(queue);

    }
}