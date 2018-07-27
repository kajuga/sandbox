package advanced_Java.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class comparators {
    public static void main(String[] args) {

        List<String> animals = new ArrayList <>();


        animals.add("dog");
        animals.add("cat");
        animals.add("frog");
        animals.add("bird");

        Collections.sort(animals);
        System.out.println(animals);


    }


}
