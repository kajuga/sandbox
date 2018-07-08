package stepic.collections_2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 Given a sequence of strings separated by spaces.
 Read the sequence from the standard input and store all strings to the list.
 Output the list to the standard output using System.out.println(yourList).
 The order of elements must be the same as in the input.
 Sample Input:

 Google Oracle JetBrains
 Sample Output:

 [Google, Oracle, JetBrains]
 */

public class Step_3_Strind_To_List_from_Scanner {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String separator = " ";
        String[] parce = input.split(separator);
        List <String> list = Arrays.asList(parce);
        System.out.println(list);

    }
}
