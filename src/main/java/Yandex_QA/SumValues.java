package Yandex_QA;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SumValues {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        Set<Integer> numbers = new HashSet<>();
        for (int i=0; i < count; i++){
            numbers.add(scanner.nextInt());
        }
        System.out.println(sum(numbers));
    }

    private static int sum(Set<Integer> numbers) {
        int result = 0;
        for (int x : numbers) {
            result += x;
        }
        return result;
    }
}
