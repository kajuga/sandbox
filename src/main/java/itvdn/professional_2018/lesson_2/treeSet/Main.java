package itvdn.professional_2018.lesson_2.treeSet;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        NavigableSet<Integer> ts = new TreeSet <>();
        ts.add(7);
        ts.add(2);
        ts.add(14);
        NavigableSet<Car> tc = new TreeSet<>();
        //Добавляем объекты Car в коллекцию
        tc.add(new Car(5000));
        tc.add(new Car(3000));
        System.out.println(tc);

        //Создаем подколлекцию headSet, не больше цифра 5, true - включительно
        NavigableSet<Integer> tsl = ts.headSet(5, true);
        System.out.println(tsl);
        tsl.add(3);
        System.out.println(ts);
        System.out.println(tsl);
        ts.add(8);
        System.out.println(ts + "\n" + tsl);



    }
}

class Car implements Comparable<Car> {
    int price;

    public Car(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "" + this.price;
    }

    @Override
    public int compareTo(Car car) {
        return this.price - car.price;
    }
}
