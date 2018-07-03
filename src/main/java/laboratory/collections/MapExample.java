package laboratory.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
//JAVA 7:
        Map<String, String> map = new HashMap<>();
        if (map.get("name") == null)
            map.put("name", "Gus");

//JAVA 8:  ::::PutIfAbsent()::::

        Map<String, String> mapNew = new HashMap<>();
        mapNew.putIfAbsent("name", "Gus");

//JAVA 8 ::::: СomputeIfPresent() :::::
//Если нам необходимо произвести какое-то действие со значением в Map, если оно там есть
        Map<String, String> map2 = new HashMap<>();
        map2.put("name", "Joan");
        map2.computeIfPresent("name", (key, value) -> key + ", " + value);
        System.out.println(map2.get("name")); //output: name, Joan

        Map<String, String> map2Example = new HashMap<>();
        map.computeIfPresent("awesome key", (key, value) -> key + ", " + value);
        System.out.println(map2Example.get("awesome key")); //output: null


 //JAVA 8   :::REMOVE:::
        Map<String, String> map3 = new HashMap<>();
        map.put("surname", "Petrov");

        map3.remove("surname", "Vasichkin");
        System.out.println(map3.get("surname")); // Petrov

        map3.remove("surname", "Petrov");
        System.out.println(map3.get("surname")); // null
    }
}
