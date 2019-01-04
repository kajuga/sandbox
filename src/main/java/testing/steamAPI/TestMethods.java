package testing.steamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

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





        }

    }


