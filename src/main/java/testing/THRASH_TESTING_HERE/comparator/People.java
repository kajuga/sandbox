package testing.THRASH_TESTING_HERE.comparator;

import java.util.Arrays;

public class People implements Comparable {
    int age;
    String name;


    public People(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        return this.age - ((People)o).age;
    }

    @Override
    public String toString() {
        return "People{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}


    class Test{

        public static void main(String[] args) {
            People p1 = new People(12, "SashaSASHO");
            People p2 = new People(2, "eerSasha");
            People p3 = new People(42, "eeeeeSasha");
            People p4 = new People(32, "Sasha");

            People[] all = {p1, p2, p3, p4};
            Arrays.sort(all);
            for (int i = 0; i < all.length; i++) {
                System.out.println(all[i]);
            }
        }

}
