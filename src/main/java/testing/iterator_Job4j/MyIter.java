package testing.iterator_Job4j;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class MyIter {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList <>();

        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);


        Iterator<Integer> iter = arr.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
            iter.remove();

        }

    }
}
