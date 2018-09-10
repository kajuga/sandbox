package advanced_Java.maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class HashMapTreeMapAdvanced {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();              //не гарантируется порядок
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(); //гарантирует порядок - в каком были добавлены, в таком и вернутся
        Map<Integer, String> treeMap = new TreeMap<>();             //пара ключ- значение сортируются по ключу "естественный порядок"
        testMap(hashMap);
        testMap(linkedHashMap);
        testMap(treeMap);
        }

        public static void testMap (Map<Integer, String> map) {
        map.put(39, "Bob");
        map.put(2, "Vik");
        map.put(1500, "Tom");
        map.put(7, "Bob");

        for (Map.Entry<Integer, String> testMap : map.entrySet()) {
            System.out.println(testMap.getKey() + " : " + testMap.getValue());
        }

    }
}
