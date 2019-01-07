package testing.steamAPI;


// Java code for Stream flatMapToInt
// (Function mapper) to get an IntStream
// consisting of the results of replacing
// each element of this stream with the
// contents of a mapped stream.
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class FloatMapTesting {
    // Driver code
    public static void main(String[] args) {
        List <String> list = Arrays.asList("1", "2", "3", "4", "5");

//        System.out.println(list.stream().findFirst().get());
//        list.stream().flatMapToInt(n -> Integer.parseInt(n))
//                .forEach();


        List <String> phones = new ArrayList <String>();
        Collections.addAll(phones, "iPhone 8", "HTC U12", "Huawei Nexus 6P",
                "Samsung Galaxy S9", "LG G6", "Xiaomi MI6", "ASUS Zenfone 2",
                "Sony Xperia Z5", "Meizu Pro 6", "Lenovo S850");

        List <String> filteredPhones = phones.stream()
                .filter(s -> s.length() < 8)
                .collect(Collectors.toList());
        System.out.println("1111111111111111111111111111111");
        for (String s : filteredPhones) {
            System.out.println(s);
        }
            System.out.println("22222222222222222222222222");
            for (String y : phones) {
                System.out.println(y);
            }
        }
    }





