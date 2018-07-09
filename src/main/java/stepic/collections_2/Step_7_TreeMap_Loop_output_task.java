package stepic.collections_2;

import java.util.Map;
import java.util.TreeMap;

/**
 * The map is given. Output each its key-value pair in the loop with a new line.

 Each line must be in form of key=value (for example, Gamma=3)
 Sample Input:

 Sample Output:

 Alpha=1
 Gamma=3
 Omega=24
 */

public class Step_7_TreeMap_Loop_output_task {

    public static void main(String[] args) {


        Map<String, Integer> map = new TreeMap<>();
        map.put("Gamma",  3);
        map.put("Omega", 24);
        map.put("Alpha",  1);

        for(Map.Entry mp : map.entrySet()){
            System.out.println(mp);
        }


        //write your code here



    }
}