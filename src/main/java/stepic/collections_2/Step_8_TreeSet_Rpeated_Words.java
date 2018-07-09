package stepic.collections_2;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 When Anthony read "War and Peace", he wondered how many words and how much of them were used in this book.
 Help Anthony to write a simplified version of a program that can count the words, separated by a space and output the resulting statistics.
 The program must read one line from the standard input and for each unique word in this line output the count
 of its repeated occurrence (case insensitive) in the "word amount" format (see the output example).
 The order of words output may be arbitrary. Each unique word must appear in the output only once.
 Sample Input:
 a aa abC aa ac abc bcd a
 Sample Output:
 a 2
 aa 2
 abc 2
 ac 1
 bcd 1
 */

public class Step_8_TreeSet_Rpeated_Words {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        String sepor = " ";
        String string = in.nextLine();
        String[] array = string.split(sepor);
        Map<String, Integer> map = new TreeMap <>();

        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i])){

                //TODO тут косяк, допилить
                map.put(array[i], map.get(array[i]) + 1);
            }
            else {
                map.put(array[i], 1);

            }

        }
    }
}
