package stepic.collections_2;

import java.util.*;

public class Step_9_Iterator_Listerator {
    public static void main(String[] args) {

        /**
         * Iterable
         */
        Collection<String> strings = Arrays.asList("first", "second", "third");

// iterating over collection using the "for-each" loop
        for (String elem : strings) {
            System.out.println(elem);
        }

        /**
         * Iterator
         */
        Set<Long> set = new TreeSet<>(); // sorted set
        set.add(10L);
        set.add(5L);
        set.add(18L);
        set.add(14L);
        set.add(9L);

        System.out.println(set); // [5, 9, 10, 14, 18]

        Iterator<Long> iter = set.iterator();
        while (iter.hasNext()) {
            Long current = iter.next();
            if (current < 10) {
                iter.remove();
            }
        }
        System.out.println(set); // [10, 14, 18]


        /**
         * ListIterator
         */
//        ListIterator<Integer> listIterator = list.listIterator(); // only for lists!
//        while (listIterator.hasPrevious()){
//            System.out.println(listIterator.previous() +" on "+ listIterator.previousIndex());
//        }



    }

}
