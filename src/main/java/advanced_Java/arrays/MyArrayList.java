package advanced_Java.arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyArrayList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {

            list.add(i);
        }
        System.out.println(list.size());
        list.remove(5);
        System.out.println(list.size());

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }



    }


}
