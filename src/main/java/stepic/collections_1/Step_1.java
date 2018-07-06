package stepic.collections_1;

import java.util.*;

public class Step_1 {

    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
        Object[] strArray = nameList.toArray();
        //write your code here

        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }

    }
}