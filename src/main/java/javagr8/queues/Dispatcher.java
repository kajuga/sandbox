package javagr8.queues;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Dispatcher {

    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>(2, new Comparator<Integer>(){
            public int compare(Integer i1, Integer i2){
                return  i2 - i1;
            }
        });
        q.offer(7);
        q.offer(9);
        System.out.println(q);
        q.offer(1);
        q.offer(6);
        System.out.println("Изначально" + q);
        System.out.println("poll: " + q.poll());
        System.out.println("poll: " + q.poll());
        System.out.println("poll: " + q.poll());
        System.out.println("Остаток: " + q);

    }

}
