package advanced_Java.arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Fedorov Aleksandr (msg2fedorov@gmail.com)
 */

public class LinkedList_AdvancedV2 {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList <>();
        List<Integer> arrayList = new ArrayList <>();
        measureTime(linkedList);
        measureTime(arrayList );
    }


    private static void  measureTime (List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 10; i < 100000; i++) {
            list.add(0, i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

}
