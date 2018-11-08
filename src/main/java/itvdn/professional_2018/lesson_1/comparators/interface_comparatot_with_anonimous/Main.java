package itvdn.professional_2018.lesson_1.comparators.interface_comparatot_with_anonimous;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Oiental", 7, 25, 5000);
        Animal dog = new Animal("Labrador", 30, 20, 4000);
        Animal bird = new Animal("Popugai", 15, 8, 50000);

        Animal[] c = {cat, dog, bird};
        //Анонимный класс - реализация еомпаратора на месте
        Arrays.sort(c, new Comparator <Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.price - o2.price;
            }
        });
        //тоже самое с лямбдой
        Arrays.sort(c, (o1, o2) -> o1.speed - o2.speed);
    }
}
