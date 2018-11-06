package itvdn.professional_2018.comparators.interface_comparator_with_objects;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Oiental", 7, 25, 5000);
        Animal dog = new Animal("Labrador", 30, 20, 4000);
        Animal bird = new Animal("Popugai", 15, 8, 50000);

        Animal[]c = {cat, dog, bird};

        Arrays.sort(c, new ComparatorByPrice());
        for (Animal tmp : c) {
            System.out.println(tmp);
        }
        System.out.println();
        Arrays.sort(c, new ComparatorBySpeed());
        for (Animal tmp : c) {
            System.out.println(tmp);
        }

        Arrays.sort(c, new ComparatorByColor());

        for (Animal tmp : c) {
            System.out.println(tmp);
        }
    }
 }
