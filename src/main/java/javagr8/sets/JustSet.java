package javagr8.sets;

import java.util.*;

public class JustSet {
    public static void main(String[] args) {
        Set <Car> set = new HashSet <>();

        set.add(new Car(4000));
        set.add(new Car(2000));
        set.add(new Car(1000));
        set.add(new Car(7000));

        for (Car car: set) {
            System.out.println("Мой HashSet: " + car);
        }

        Set<Car> set2 = new LinkedHashSet <>();
        set2.add(new Car(6000));
        set2.add(new Car(2000));
        set2.add(new Car(7000));
        set2.add(new Car(12000));
        set2.add(new Car(6000));

        for (Car car: set2) {
            System.out.println("Мой LinkedHashSet: " + car);
        }

        Iterator<Car> iterator = set2.iterator();
        while (iterator.hasNext()){
            System.out.println("Мой итератор" + iterator.next());
        }



        SortedSet<Car> treeSet = new TreeSet <>();
        treeSet.add(new Car(9000));
        treeSet.add(new Car(5000));
        treeSet.add(new Car(3000));
        treeSet.add(new Car(1000));
        for (Car car3: treeSet) {
            System.out.println("Мой TreeSet: " + car3);
        }






    }


}


class MyCar{
    int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
