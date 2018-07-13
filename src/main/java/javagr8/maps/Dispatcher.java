package javagr8.maps;

import java.util.*;

public class Dispatcher {
    public static void main(String[] args) {

        NavigableMap<String, Car> m = new TreeMap();
        Car c = new Car(8000);
        m.put("Serg", new Car(7000));
        m.put("Ann", c);
        m.put("Mary", new Car(5000));
//        System.out.println(m);
        m.put("Mary", new Car(6000));
//        System.out.println(m);
//        System.out.println(m.get("Serg"));
//        System.out.println(m.containsKey("Serg"));
//        System.out.println(m.containsKey("XXX"));
//        System.out.println(m.containsValue(8000));
//        System.out.println(m.containsValue(c));
        Set<String> keys = m.keySet();
        Collection<Car> cars = m.values();
//        System.out.println(keys);
//        System.out.println(cars);
        Set<Map.Entry<String, Car>> s = m.entrySet();
        System.out.println(s);
        for (Map.Entry<String, Car> temp : s){
             temp.setValue(new Car(1000));
        }
        System.out.println(s);




    }

}

class Car{
    int price;

    public Car(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return " " + this.price;
    }
}

