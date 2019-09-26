package quizful;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArraysRemove {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Collection col = list;

        list.add(1);
        list.add(1);
        list.add(1);

        list.remove(0);
        col.remove(0);
//        col.add(22);
//        col.add(32);
//        col.add(42);

        System.out.println("Размер list: " + list.size());
        System.out.println("Размер col: " + col.size());
    }
}

//    Метод remove(Object) из интерфейса Collection позволяет удалять из коллекции заданный объект.
//        Соответственно, по команде col.remove(0); должен удаляться объект со значением 0, но такого в коллекции нет, поэтому ничего не удаляется.
//        В интерфейсе List имеется дополнительный метод remove(int), который позволяет удалять элемент с указанным индексом.
//        Соответственно, по команде list.remove(0); удаляется первый элемент.