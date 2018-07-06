package stepic.collections_1;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Step_4_TreeSet {

    public static void main(String[] args) {
        Set<String> nameSet = new TreeSet<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));

        //JAVA 8:
        nameSet.forEach(arg->System.out.println(arg));

        //ЕЩЕ из 8:
        nameSet.forEach(System.out::println);

        //Стандарт
        for(Object o : nameSet){
            System.out.println(o);
        }
    }
}