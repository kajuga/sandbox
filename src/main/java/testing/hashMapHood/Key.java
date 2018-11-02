package testing.hashMapHood;

import java.util.HashMap;
import java.util.Map;

// специальный класс Key для переопределени методов hashCode()
// и equals()
class Key {

    public static void main(String[] args) {
        //String key = new String("key");
        //String val = new String("value");
        String key = "key";
        String val = "value";

        Map map = new HashMap();

        map.put(key, val);

        System.out.println("hashmap object created. Its key hashcode = " + key.hashCode());
// the hashcode is 106079
        System.out.println("hashmap object value for key = " + map.get(key));

        // Let's store using a key with same hashcode
        Integer intkey = new Integer(106079);
        val = "value2";
        map.put(intkey, val);
        System.out.println("hashmap object created. Its intkey hashcode = " + intkey.hashCode());
// this returns 106079 once again. So both key and intkey have the same hashcode

// Let's get the values
        System.out.println("hashmap object value for intkey = " + map.get(intkey));
        System.out.println("hashmap object value for key = " + map.get(key));
        System.out.println(19 % 16);
    }
}
