package stepic.collections_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Step_6_ArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(0);
        list.add(1);
        list.add(7);

        //also
        List<Integer> list2 = Arrays.asList(2, 0, 1, 7);

        System.out.println(list);
        System.out.println(list2);

        //Или так
        List<Integer> list3 =new ArrayList<Integer>(){
            {
                add(2);
                add(0);
                add(1);
                add(7);
            }
        };
        System.out.println(list3);
    }
}