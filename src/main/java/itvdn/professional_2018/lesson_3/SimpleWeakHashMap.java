package itvdn.professional_2018.lesson_3;

import javafx.util.converter.ShortStringConverter;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class SimpleWeakHashMap {
    public static void main(String[] args) {
        Map<String, String> weakHashMap = new WeakHashMap<>();
        Map<String, String> hashMap = new HashMap<>();
        String keyWeakHashMap = new String("keyWeakHashMap");
        String keyHashMap = new String("keyHashMap");
        weakHashMap.put(keyWeakHashMap, "weakHash");
        hashMap.put(keyHashMap, "Hash");
        System.out.println("Before garbadge collector" + weakHashMap.get("keyWeakHashMap") + " " + hashMap.get("keyHashMap"));

        keyWeakHashMap = null;
        keyHashMap = null;
        System.gc();
        System.out.println("After garbadge collector" + weakHashMap.get("keyWeakHashMap") + " " + hashMap.get("keyHashMap"));



//        //strong reference
//        Integer test = 1;
//        //soft reference
//        SoftReference<Integer> softReference = new SoftReference <Integer>(test);
//        test = null;
//
//        //weak reference
//        WeakReference<Integer> weakReference = new WeakReference <Integer>(test);
//        test = null;
//
//        //fantom reference
//        PhantomReference<Integer> phantomReference = new PhantomReference <>(test, new ReferenceQueue <>());



    }



}
