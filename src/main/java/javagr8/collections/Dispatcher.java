package javagr8.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Dispatcher {
    public static void main(String[] args) {

        ArrayList<Car> al = new ArrayList();
        al.add(new Car("BMW"));
        al.add(new Car("Olep"));
        al.add(new Car("Lada"));
        al.add(new Car("Mers"));

        Car[] c = new Car[al.size()];
        al.toArray(c);

        c[2] = new Car("Reno");
        for (Car car: c) {
            System.out.println(car);
        }

        System.out.println(al);
        al = new ArrayList (Arrays.asList(c));
        System.out.println(al);



    }



}
