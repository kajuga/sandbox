package itvdn.professional_2018.lesson_2.hashSet;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Creste hashSet collection
        Set<String> set = new HashSet<>();
        set.add(null);
                for (String text : set) {
            System.out.println(text);
        }

//        set.add("Арбуз");
//        set.add("Банан");
//        set.add("Дыня");
//        set.add("Земляника");
//        set.add("Ирис");
//        set.add("Картофель");
//        for (String text : set) {
//            System.out.println(text + " " + text.hashCode());
//        }



    }


}
