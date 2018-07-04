package laboratory.lambda;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Lambda_Example_2 {
    public static void main(String[] a) {

        List list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        System.out.print("Выводит все числа: ");
        evaluate(list, (n) -> true);

        System.out.print("Не выводит ни одного числа: ");
        evaluate(list, (n) -> false);

        System.out.println("Пример из другого урока, навскидку");
        list.forEach(x -> System.out.println(x));
        System.out.println("Моя модификация с пробелом");
        list.forEach(z -> System.out.print(z + " "));
    }

    public static void evaluate(List list, Predicate predicate) {
        for (Object n : list) {
            if (predicate.test(n)) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }
}

