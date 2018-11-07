package itvdn.professional_2018.lesson_2.priorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        //Создаем класс PriorityQueue, начальная емкость 2 и при помощи внутреннего класса - Comparator
        Queue<Integer> q = new PriorityQueue <>(2, new Comparator <Integer>() {
            @Override
            //Реалищуем обратный метод сортировки при помощи метода Compare
            public int compare(Integer i1, Integer i2) {
                return i2 - i1;
            }
        });
        //вставляю в очередь элемент
        q.offer(7);
        q.offer(9);
        System.out.println(q);
        q.offer(1);
        q.offer(6);
        System.out.println(q);

        //Метод poll возвращает и удаляет головной элемент очереди
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q);




    }



}
