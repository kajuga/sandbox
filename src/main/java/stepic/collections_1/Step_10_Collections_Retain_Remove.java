package stepic.collections_1;

import java.util.ArrayList;
import java.util.List;

public class Step_10_Collections_Retain_Remove {
    public static void main(String[] args) {
        List <Integer> list1 = new ArrayList <Integer>(5);
        List <Integer> list2 = new ArrayList <Integer>(5);

        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        System.out.println(list1);

        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        System.out.println(list2);

        System.out.println(list1.removeAll(list2));
        System.out.println(list1);
        }
    }