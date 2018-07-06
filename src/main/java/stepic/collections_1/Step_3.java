package stepic.collections_1;

import java.util.Map;
import java.util.TreeMap;

public class Step_3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("Gamma",  3);
        map.put("Omega", 24);
        map.put("Alpha",  1);

        //JAVA 8:
        map.entrySet().forEach(System.out::println);

        //ЕЩЕ 8:
        map.entrySet().stream().forEach(System.out::println);

        //ЕЩЕ 8:
        map.forEach((x,y) -> System.out.println(x + "=" + y));

        //ЕЩЕ 8:
        map.entrySet().forEach(entry -> System.out.println(String.format("%s=%d", entry.getKey(), entry.getValue())));

        //По старинке:
        for(Map.Entry <String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}

