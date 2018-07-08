package stepic.collections_2;


import java.util.*;

/**
 * Write a program that reads the list of integer number separated by spaces
 * from the standard input and then remove all numbers with even indexes (0, 2, 4, and so on).
 * After, the program should output the result sequence in the reverse order.

 */

public class Step_2_List_With_Space_Separator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String delitel = " ";
        String[] psrsedString = input.split(delitel);


        List<String> list = Arrays.asList(psrsedString);
        List <String> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (i % 2 != 0) {
                result.add(list.get(i));
            }
        }

        String[] arr = new String[result.size()];
        result.toArray(arr);
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}