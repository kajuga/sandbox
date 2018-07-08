package stepic.collections_2;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 Create ArrayDeque by name queue in any way known to you and push the following four numbers 2, 0, 1, 7.
 The code for displaying the queue is already written.
 Sample Input:
 Sample Output:
 [2, 0, 1, 7]
 */


public class Step_4_ArrayDeque {
    public static void main(String[] args) {

        Deque<Integer> queue = new ArrayDeque<>(Arrays.asList(2, 0, 1, 7));



        //write your code here


        System.out.println(queue);

    }
}


//
//    Deque<Integer> queue = new ArrayDeque<>(Arrays.asList(1,2,3,4));
//        queue.addLast(5);
//                queue.removeFirst();
//                queue.removeFirst();
//                System.out.println(queue);
//
//                //или так:
//                queue.add(5);       //сразу в конец вставляет.
//                queue.remove();     //удаляет с начала.
//                queue.remove();
//                System.out.println(queue);
//                }