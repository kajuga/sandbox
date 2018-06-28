package laboratory.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ComparatorDemo {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Joe", 24),
                new Person("Pete", 18),
                new Person("Chris", 21)
        );
        Collections.sort(people, new LexicographicComparator());
        System.out.println(people);
        Collections.sort(people, new AgeComparator());
        System.out.println(people);
    }
}

class LexicographicComparator implements Comparator<Person> {
    @Override
    public int compare(Person a, Person b) {
        return a.name.compareToIgnoreCase(b.name);
    }
}

class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person a, Person b) {
        return a.age < b.age ? -1 : a.age == b.age ? 0 : 1;     //вот это тоже прочитать
    }
}

class Person {

    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    @Override
    public String toString() {
        return String.format("{name=%s, age=%d}", name, age);
    }
}

/**
 Здесь очень короткий шаблон для сортировки сразу:

 Collections.sort(people,new Comparator<Person>(){
@Override
public int compare(final Person lhs,Person rhs) {
//TODO return 1 if rhs should be before lhs
//     return -1 if lhs should be before rhs
//     return 0 otherwise
}
});
 */