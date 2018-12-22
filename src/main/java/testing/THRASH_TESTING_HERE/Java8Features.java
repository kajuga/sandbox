package testing.THRASH_TESTING_HERE;

import java.util.*;

public class Java8Features {
    public static void main(String[] args) {
        //Перебор коллекции с удалением фильтрованного (>5)
        List <Integer> numbers = new ArrayList <>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        numbers.removeIf(s -> s > 5);
        numbers.forEach(s -> System.out.print(s + " "));

        //прикольный foreach для map
        Map <String, String> books = new HashMap<> ();
        books.put("Война и мир", "Лев Толстой");
        books.put("Преступление и наказание", "Федор Достоевский");
        books.put("Философия Java", "Брюс Эккель");
        books.put("Братья Карамазовы", "Федор Достоевский");
        books.put("Властелин Колец", "Джон Толкин");
        books.forEach((a,b) -> System.out.println("Название книги: " + a + ". Автор: " + b));
    }
}
