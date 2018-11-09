package itvdn.professional_2018.lesson_3.treeMap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        NavigableMap<String, Animal> treeMap = new TreeMap <>();
        treeMap.put("Vasyl", new Animal(5000));
        treeMap.put("Abramka", new Animal(10500));
        treeMap.put("Eolobok", new Animal(3000));
        treeMap.put("Civik", new Animal(1000));

        System.out.println(treeMap);

        //вывожу значение по ключу Vasyl
        System.out.println(treeMap.get("Vasyl"));

        System.out.println(treeMap.containsKey("Abramka"));
        System.out.println(treeMap.containsValue(new Animal(1000)));
        System.out.println(treeMap.containsValue(new Animal(3000)));

        Set<String> nameSet = treeMap.keySet();
        System.out.println(nameSet);
        Collection<Animal> petsPrice = treeMap.values();
        System.out.println(petsPrice);

        Set<Map.Entry<String, Animal>> keysAndValues = treeMap.entrySet();
        System.out.println(keysAndValues);
        for (Map.Entry <String, Animal> temp : keysAndValues) {
            temp.setValue(new Animal(10000));
        }
        System.out.println(keysAndValues);
    }
}


class Animal {
    int price;

    public Animal(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "PRICE" + " " + price;
    }
}
