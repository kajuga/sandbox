package stepic.collections_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class Step_13_ArrayLists_Compare {

    public static void main(String[] args) {

        List <Integer> list1 = new ArrayList <>(asList(1, 2, 3));
        List <Integer> list2 = new ArrayList <>(asList(1, 3, 2));

        System.out.println(list1.subList(1, 2));
        System.out.println(list2.subList(2, 3));

        System.out.println("list1.subList(1, 2).equals(list2.subList(2, 3))? " +
                list1.subList(1, 2).equals(list2.subList(2, 3)));

        System.out.println("-------------------------------------------------------");
        List<Integer> list = new ArrayList<>(asList(1, 3, 43, -9, 0, 18));
        System.out.println(list);
//true
        System.out.println(list.subList(0, 3).contains(43));
//false
        System.out.println(list.subList(0, 3).contains(-9));
//delete 3 elements
        System.out.println(list.get(0));
        System.out.println(list.get(3));
        list.subList(0, 3).clear();
        System.out.println(list);

    }
}
