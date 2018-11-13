package testing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Quick_Comparator {
    public static void main(String[] args) {

        List <Integer> list = new ArrayList <>();
        list.add(16);
        list.add(134);
        list.add(23);
        list.add(22116);

        //без сортировки
        System.out.println("Без сортировки: ");
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();

        //сортировка естественный порядок
        Collections.sort(list);
        System.out.println("Сортировка методом Collections.sort(): ");
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        //обратно компаратором

        System.out.println("Обратная сортировка c компаратором");
        Collections.sort(list, new Comparator <Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();
        //и опять обратно реверсом в Collections
        System.out.println("Реверс с Collections.reverse()");
        Collections.reverse(list);
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();
        //заполняю коллекцию одним и тем же значением
        Collections.fill(list, 888);
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
