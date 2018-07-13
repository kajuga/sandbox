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
        return this.price * 17;
    }

}
