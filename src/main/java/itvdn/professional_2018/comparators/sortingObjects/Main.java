package itvdn.professional_2018.comparators.sortingObjects;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Animal2 cat = new Animal2("Oriental", 7, 25, 5000);
        Animal2 dog = new Animal2("Labrador", 30, 20, 4000);
        Animal2 bird = new Animal2("Kin Penguin", 15, 8, 50000);

        Animal2[] c = {cat, dog, bird};
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }

        Arrays.sort(c);
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }




    }
}
