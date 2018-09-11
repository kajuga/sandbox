package advanced_Java.Lists_Queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedList_Queue {

    public static void main(String[] args) {
        Person person = new Person(2);
        Person person1 = new Person(1);
        Person person2 = new Person(3);
        Person person3 = new Person(0);

        Queue <Person> personQueue = new LinkedList <>();
        List <Person> personList = new LinkedList <>();

        personQueue.add(person);
        personQueue.add(person1);
        personQueue.add(person2);
        personQueue.add(person3);

        personList.add(person);
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        for (Person testQueue : personQueue) {
            System.out.println(testQueue);
             {
        }
    }
}
    static class Person {
        private int id;

        public Person(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    '}';
        }
    }

}
