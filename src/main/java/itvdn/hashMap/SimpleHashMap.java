package itvdn.hashMap;

import java.util.*;

/**
 * @author Aleksandr Fedorov (msg2fedorov@gmail.com)
 */
public class SimpleHashMap {

    public static void main(String[] args) {
        Map<String, Human> humanMap = new HashMap <>();
        humanMap.put("Sashok", new Human(5000));
        humanMap.put("Pushok", new Human(2000));
        humanMap.put("Gavnushok", new Human(7000));

        System.out.println(humanMap);
        System.out.println("Вытаскиваю значение по ключу Pushok: " + humanMap.get("Pushok"));
        System.out.println(humanMap.keySet());
        Set<String> keySet = humanMap.keySet();
        System.out.println("Вывожу ключи из сета: " + keySet);
        Collection<Human> humanCollection = humanMap.values();

        System.out.println("Вывожу values из коллекции: " + humanCollection);






    }

    public static class Human {
        private int price;

        public Human(int price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Human{" +
                    "price=" + price +
                    '}';
        }
    }


}
