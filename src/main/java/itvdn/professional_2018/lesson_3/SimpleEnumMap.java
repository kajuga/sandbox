package itvdn.professional_2018.lesson_3;

import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

public class SimpleEnumMap {
    public static void main(String[] args) {
        Map <Animal, String> enumMap = new EnumMap <Animal, String>(Animal.class);
        enumMap.put(Animal.CAT, null);
        enumMap.put(Animal.DOG, "D");
        enumMap.put(Animal.BIRD, "B");

//        Set<Map.Entry<Animal, String>> entrySet = enumMap.entrySet();
//        for (Map.Entry <Animal, String> animalStringEntry : entrySet) {
//            System.out.println(animalStringEntry);
//        }
        Set set = enumMap.entrySet();
        for (Object o : set) {
            Map.Entry m = (Map.Entry) o;
            System.out.println(m.getKey() + " " + m.getValue());
        }


    }
}



enum Animal {
    CAT, DOG, BIRD
}
