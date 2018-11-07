package itvdn.professional_2018.lesson_2.arrayDeque;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        //создаем объект ArrayDeque
        ArrayDeque <String> states = new ArrayDeque <>();
        //стандартное добавление элементов
        states.add("Украина");
        states.add("Франция");

        //добавлляем элемент в самое начало
        states.push("Великобритания");

        //получаем первый элемент без удаления
        String sFirst = states.getFirst();
        String sLast = states.getLast();

        while (states.peek() != null) {
            //извлечение с начала
            System.out.println(states.pop());
        }
        System.out.println("Размер очереди: " + states.size());
        ;

        ArrayDeque <Person> people = new ArrayDeque <Person>();
        people.addFirst(new Person("Tom"));
        people.addFirst(new Person("Nick"));
        for (Person p : people) {
            System.out.println(p.getValue());
        }
    }
}

    class Person {
        private String value    ;

        public Person(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }



