package stepic.collections_1;

import java.util.Map;
import java.util.TreeMap;

public class Step_8_TreeMap {


    public static void main(String[] args) {

        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Omega", 24);
        map.put("Alpha", 1);
        map.put("Gamma", 3);

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
