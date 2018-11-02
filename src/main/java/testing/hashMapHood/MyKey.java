package testing.hashMapHood;

import java.util.HashMap;
import java.util.Map;

public class MyKey {
    private int id;

    @Override
    public int hashCode() {
        System.out.println("Calling hashCode()");
        return id;
    }

    // constructor, setters and getters


    public MyKey(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        MyKey key = new MyKey(1);
        Map<MyKey, String> map = new HashMap<>();
        map.put(key, "val");
    }

    }


