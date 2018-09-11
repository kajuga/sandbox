package advanced_Java.setz;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSetAdvanced {
    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet <>();
        linkedHashSet.add("Bob");
        linkedHashSet.add("Bob");
        linkedHashSet.add("Bob");
        linkedHashSet.add("George");
        System.out.println(linkedHashSet);
        for (String example : linkedHashSet) {
            System.out.println(example);
        }
    }

}

