package javagr8.sets;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Dispatcher {
    public static void main(String[] args) {
        NavigableSet<Integer> ts = new TreeSet <>();
        ts.add(7);
        ts.add(2);
        ts.add(14);
        ts.add(9);
        ts.add(5);
        System.out.println(ts);
        ts.add(7);


    }
}

class Car{}
