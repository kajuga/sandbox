package javagr8.hash;

import java.util.HashMap;

public class Dispatcher {
    public static void main(String[] args) {

        Car c1 = new Car(5000, "Opel");
        Car c2 = new Car(7000, "Audi");
        Car c3 = new Car(9000, "BMW");
        HashMap<Car, String> hm = new HashMap <>();
        hm.put(c1, "Serg");
        hm.put(c2, "Mary");
        hm.put(c3, "Ann");
        Car find = new Car(0, "Audi");
        System.out.println(hm.get(find));
    }
}

class Car{
    int price;
    String moodel;

    public Car(int price, String moodel) {
        this.price = price;
        this.moodel = moodel;
    }
    public int hashCode(){
        return this.moodel.length() * 17;
    }

    @Override
    public boolean equals(Object o) {
       return this.moodel.equals(((Car)o).moodel);
    }
}