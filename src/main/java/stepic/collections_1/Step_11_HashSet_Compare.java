package stepic.collections_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Step_11_HashSet_Compare {
    public static void main(String[] args) {

        Set <Integer> set1 = new HashSet <>(Arrays.asList(1, 2, 3));
        Set <Integer> set2 = new HashSet <>(Arrays.asList(1, 3, 2));
        System.out.println("set1.equals(set2)? "+set1.equals(set2));

    }
}
