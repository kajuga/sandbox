package testing.THRASH_TESTING_HERE.java8features;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

    Map <String, String> books = new HashMap <>();
books.put("Война и мир", "Лев Толстой");
books.put("Преступление и наказание", "Федор Достоевский");
books.put("Философия Java", "Брюс Эккель");
books.put("Братья Карамазовы", "Федор Достоевский");
books.put("Властелин Колец", "Джон Толкин");
books.forEach((a,b) -> b = "888");
books.forEach((a,b) -> System.out.println(a +" " + b));

}}


/*
books.computeIfPresent("Евгений Онегин", (a,b) -> b="Александр Пушкин");
 */