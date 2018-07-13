package javagr8.sets;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Dispatcher {
    public static void main(String[] args) {
        NavigableSet<Integer> ts = new TreeSet <>();
        ts.add(7);
        ts.add(2);
        ts.add(14);
        ts.add(9);
        ts.add(5);
//        System.out.println(ts);
//        System.out.println(ts.add(7));
        System.out.println("Основная коллекция: " + ts);
//        System.out.println(ts.ceiling(10));
//        NavigableSet<Car> tc = new TreeSet <>();
//        tc.add(new Car(5000));
//        tc.add(new Car(3000));
//        System.out.println(tc);
        NavigableSet<Integer> tc1 = ts.headSet(5, true);
        System.out.println("Вывод в консоль подколлекции элементов до цифры 5, включая 5: " + tc1);
        tc1.add(3);
        System.out.println("В подколлекцию добавил 3, на выходе подколлекции вот что: " + tc1);
        System.out.println("Вывод первоначальная коллекция: " + ts);
        ts.add(8);
        System.out.println("В  основную коллекцию добавил 8, на выходе вот что: " + ts);
        System.out.println("Вывод подколлекции: " + tc1);
    }
}

class Car implements Comparable<Car>{

    int price;

    public Car(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "" + this.price;
    }

    @Override
    public int compareTo(Car o) {
        return this.price - o.price;
    }
}
