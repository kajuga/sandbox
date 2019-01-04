package testing.steamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestMethods {
    public static void main(String[] args) {
        int[] numbers = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        int count = 0;
        for(int i : numbers) {
            if (i > 0) {
                ++count;
            }
        }
            System.out.println(count);
        System.out.println("================");
        long counter = IntStream.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5).filter(w -> w > 0).count();
        System.out.println(counter);

        List <String> list = new ArrayList <>();
        Collections.addAll(list, "Moscow", "London", "Volgograd", "Mihailovkha");
        list.stream()       // получаем поток
                .filter(s -> s.length() > 6)    // применяем фильтрацию по длине
                .forEach(s -> System.out.println(s)); // выводим отфильтрованные строки на консоль

        System.out.println("::::::::::::::::::::::::::::::::::::::");

        Stream<String> streamstr = list.stream();
//        streamstr.filter(s -> s.length() == 6);
//        streamstr.forEach(s -> System.out.println(s));

        Stream<String> citiesStream = Stream.of("Париж", "Лондон", "Мадрид","Берлин", "Брюссель");
        Stream<Integer> citiesStream2 = Stream.of(2, 3, 6,34, 44);
        citiesStream.forEach(System.out::println);
        citiesStream2.forEach(System.out::print);








        }

    }


