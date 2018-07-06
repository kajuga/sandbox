package stepic.collections_1;

import java.util.Set;
import java.util.TreeSet;

public class Step_7_TreeSet {

    public static void main(String[] args) {

        Set<String> treeSet = new TreeSet <String>() {
            {
                add("Gamma");
                add("Alpha");
                add("Omega");
            }
        };
        System.out.println(treeSet);
    }
}