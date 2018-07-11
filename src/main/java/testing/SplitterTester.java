package testing;

import java.util.*;

public class SplitterTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();

        String[] token = string.split(" ");

        for (String str: token) {
            System.out.println(str);
        }

        List<String> sortedList = Arrays.asList(token);
        sortedList.sort(String::compareToIgnoreCase);
        for (String ssstttrr : sortedList) {
            System.out.println(ssstttrr);
        }
        }
    }