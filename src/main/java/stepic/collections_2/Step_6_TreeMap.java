package stepic.collections_2;

import java.util.Map;
import java.util.TreeMap;

/**
 Create TreeMap by name map in any way known to you and fill it with the following three key - value pairs:
 Omega - 24
 Alpha - 1
 Gamma - 3
 where strings - keys and numbers - values.
 The code for displaying the map is already written.
 Sample Input:
 Sample Output:
 {Alpha=1, Gamma=3, Omega=24}
 */

public class Step_6_TreeMap {

    public static void main(String[] args) {

        //write your code here
        Map<String, Integer> map = new TreeMap <>();
        map.put("Omega", 24);
        map.put("Alpha", 1);
        map.put("Gamma", 3);




        System.out.println(map);

    }
}