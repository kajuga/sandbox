package itvdn.professional_2018.lesson_1.iteratorWithObjects;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> al = new ArrayList <>();
        al.add(new Animal("Sphynx", 5000));
        al.add(new Animal("Malamute", 4000));

        Iterator<Animal> carIterator = al.iterator();
        while (carIterator.hasNext()) {
            Animal tmp = carIterator.next();
            tmp.price += 1000;
        }
        System.out.println(al);

    }
}
