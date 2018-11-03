package shildtBook;

import java.util.*;

public class SimpleArray {
    public static void main(String[] args) {

        Map<Integer, String> myMap = new HashMap <>();
        myMap.put(1, "Одын");
        myMap.put(2, "Два");
        myMap.put(3, "Тры");
        myMap.put(4, "Чотыре");

        System.out.println(myMap.entrySet());
        for (Map.Entry<Integer, String> map: myMap.entrySet()) {
            System.out.println(map.setValue("XXX"));
        }
        System.out.println(myMap.entrySet());
        System.out.println("===========================================");
        Set<String> strings = new HashSet <>();
        strings.add("ssss");
        strings.add("ssdsss");
        strings.add("sssdss");
        strings.add("ss55sdss");
        strings.add("ssasasdss");
        System.out.println("Размер моего SET: " + strings.size());

        LinkedList<String> linkedList = new LinkedList <>();
        linkedList.add("123");
        linkedList.add("123");
        linkedList.add("123");
        linkedList.set(2, "333");





    }

}
