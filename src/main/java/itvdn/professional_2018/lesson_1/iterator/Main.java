package itvdn.professional_2018.lesson_1.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList <>();
        al.add(2);
        al.add(5);
        al.add(8);
        System.out.println(al);

        //с помощью итератора бегаем по списку
        Iterator<Integer> iterator = al.iterator();

        //Спрашиваем есть ли следующий элемент в списке, если есть, то будет переход на следующий элемент
        while(iterator.hasNext()) {
            Integer tmp = iterator.next();
            System.out.println(tmp);
        }

        //то же самое действие но через оптимизированный итераор для списков
        ListIterator<Integer> listIterator = al.listIterator();
        while (listIterator.hasNext()) {
            Integer ttmp = listIterator.next();
            System.out.println(ttmp);
        }

    }
}
