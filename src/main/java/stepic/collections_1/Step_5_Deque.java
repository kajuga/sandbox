package stepic.collections_1;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Step_5_Deque {

    public static void main(String[] args) {

        Deque<Integer> queue = new ArrayDeque<>(Arrays.asList(1,2,3,4));
        queue.addLast(5);
        queue.removeFirst();
        queue.removeFirst();
        System.out.println(queue);

        //или так:
        queue.add(5);       //сразу в конец вставляет.
        queue.remove();     //удаляет с начала.
        queue.remove();
        System.out.println(queue);
    }
}