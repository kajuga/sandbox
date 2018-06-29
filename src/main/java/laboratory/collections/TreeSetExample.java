package laboratory.collections;

import java.util.*;

public class TreeSetExample {

    public static void main(String[] args) {
        Set set = new TreeSet();
        set.add(new Person(3));
        set.add(new Person(2));
        set.add(new Person(5));
        set.add(new Person(1));
        set.add(new Person(4));
        for (Object o: set) {
            System.out.println(o);
        }
    }

    static class Person implements Comparable <Person>{
        int age;
        String name;

        public Person(int age) {
            this.age = age;
        }

        @Override
        public int compareTo(Person o) {
            return this.age - o.age;
        }

        public String toString() {
            return String.format("{age=%d}",  age);
        }
    }
}
