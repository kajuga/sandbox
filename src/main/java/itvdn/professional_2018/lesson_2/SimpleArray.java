package itvdn.professional_2018.lesson_2;

import java.util.ArrayList;

public class SimpleArray {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList <>();
//        al.add(10);
//        al.add(20);
//        al.add(0, 30);
//        al.add(40);
        for (int i = 0; i < 100; i++) {
            al.add(i);
            System.out.print(al.get(i) + " ");
        }
        System.out.println();
        System.out.println("Size is: " + al.size());
        System.out.println();
        for (int i = 0; i < 50; i++) {
            al.remove(0);
        }
        System.out.println("Size is: " + al.size());
        System.out.println(al.get(0));
        System.out.println(al.get(49));

        for (Integer integer : al) {
            System.out.print(integer + " ");
        }





    }

}
