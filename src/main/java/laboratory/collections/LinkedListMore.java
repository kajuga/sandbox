package laboratory.collections;

import java.util.LinkedList;

public class LinkedListMore {
    public static void main(String[] args) {
        LinkedList <String> states = new LinkedList <String>();

        // Добавление элементов в список
        states.add("Германия");
        states.add("Франция");
        states.addLast("Великобритания"); // добавляем элемент в конец
        states.addFirst("Испания"); // добавляем элемент в первую позицию
        states.add(1, "Италия"); // добавляем элемент с индексом 1

        System.out.printf("В списке %d элементов \n", states.size());
        System.out.println(states.get(1) + "\n");
        states.set(1, "Дания");

        for (String state : states) {
            System.out.println(state);
        }
        // проверка на наличие элемента в списке
        if (states.contains("Германия")) {
            System.out.println("Список содержит государство Германия");
        }

        states.remove("Германия");
        states.removeFirst(); // удаление первого элемента
        states.removeLast();  // удаление последнего элемента
        System.out.println("После удаления First & Last: " + "\n");
        for (String state : states) {
            System.out.println(state);
        }
        System.out.println("========");
        LinkedList <Person> people = new LinkedList <Person>();
        people.add(new Person("Алекс"));
        people.addFirst(new Person("Митя"));
        people.addLast(new Person("Прохор"));
        people.remove(1); // удаление второго элемента

        for (Person p : people) {
            System.out.println(p.getName());
        }
        Person first = people.getFirst();
        System.out.println(first.getName()); // вывод в консоль первого элемента
    }
}

class Person {
    private String name;

    public Person(String value) {
        name = value;
    }

    String getName() {
        return name;
    }
}
