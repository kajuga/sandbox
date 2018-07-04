package laboratory.lambda;

import java.util.stream.Stream;

public class Lambda_example_1 {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("a", "b", "c");
        stream.map(s -> {
            System.out.println("Map " + s);
            return s.toLowerCase();
        }).map(s -> {
            System.out.println("Map2 " + s);
            return s.toUpperCase();
        }).forEach(s -> System.out.println("foreach " + s));
     }

}
