package stepic.collections_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 A list with numbers from 0 to 20 is given.
 Remove numbers less than 10 from it without additional lists or arrays usage.
 Modify the code so that it does not raise the ConcurrentModificationException.
 Hint ! Use the Iterator.

 Sample Output:
 [10, 11, 12, 13, 14, 15, 16, 17, 18, 19
 */

public class Step_9_ArrayList_Iterator {

    public static void main(String[] args) {

        List<Integer> delList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            delList.add(i);
        }

        //JAVA 8
        delList.removeIf(n -> n < 10);
        // или ТАК*
        delList.removeIf((Integer i) -> i < 10);

        //*** change this code which raises ConcurrentModificationException
        Iterator<Integer> iter = delList.iterator();
        while (iter.hasNext()) {
            if (iter.next().intValue() < 10) {
                iter.remove();
            }
        }
        System.out.println(delList);
    }
}

/**
    List<String> list = new ArrayList<>();

 This is a clever way to create the iterator and call iterator.hasNext() like
 you would do in a while-loop. It would be the same as doing:

     Iterator<String> iterator = list.iterator();
     while (iterator.hasNext()) {
for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
        String string = iterator.next();
        if (string.isEmpty()) {
        // Remove the current element from the iterator and the list.
        iterator.remove();
        }
        }
 --------------------------------------------------
 Iterator<Integer> iter = l.iterator();
 while (iter.hasNext()) {
 if (iter.next().intValue() == 5) {
 iter.remove();
 }
 }

 */