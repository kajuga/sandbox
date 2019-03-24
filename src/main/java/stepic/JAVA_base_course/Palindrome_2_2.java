package stepic.JAVA_base_course;

import java.util.Arrays;

/**
 * Checks if given <code>text</code> is a palindrome.
 * @return <code>true</code> when <code>text</code> is a palindrome, <code>false</code> otherwise
 */

public class Palindrome_2_2 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam, I'm Adam!"));
    }



    public static boolean isPalindrome(String text) {
        String temp = text.replaceAll("[^A-Za-z1-9]+", "").toLowerCase();
        char[] arr = temp.toCharArray();
        char[] reverso = new char[arr.length];
        for (int i = arr.length-1, k = 0; i >= 0; i--, k++) {
            reverso[k] = arr[i];
            System.out.print(reverso[k]);
        }

        return Arrays.equals(arr, reverso);
    }

}
