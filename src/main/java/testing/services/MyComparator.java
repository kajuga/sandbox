package testing.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyComparator {

    public static void main(String[] args) {
        List <String> list = new ArrayList <>();
        list.add("bowwwwwwwwwwwwwno");
        list.add("aawwaono");
        list.add("kkono");
        list.add("sssbono");

        Collections.sort(list, (s, t1) -> {
                int result;
                if(s.length() > t1.length()) {
                    result = 1;
                } else if (s.length() < t1.length()) {
                    result = -1;
                } else {
                    result = 0;
                }
                return result;
            });


        System.out.println(list);
    }
}

