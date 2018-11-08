package itvdn.professional_2018.lesson_1.maps;

import java.util.HashMap;
import java.util.Map;

public class SimpleMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap <>();
        map.put(null, null);
//        map.put("World", 100);
//        map.put("World1", 150);
//        map.put("World3", 200);
//        map.put("World2", 300);

        System.out.println(map);

        for (Map.Entry<String, Integer> temp : map.entrySet()) {
            System.out.println(temp.getKey() + " " + temp.getValue());
        }


    }
}
