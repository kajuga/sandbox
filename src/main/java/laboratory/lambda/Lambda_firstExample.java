package laboratory.lambda;

import java.util.Arrays;
import java.util.List;

public class Lambda_firstExample {
    public static void main(String[] args) {
        // Старый способ:
        List list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        for(Object n: list) {
            System.out.println(n);
        }
        // Новый способ:
        List list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        list2.forEach(x -> System.out.println(x));

        // Also новый способ:
        List list3 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        list.forEach(System.out::println);
    }
}
