package stepic.JAVA_base_course;

/**
 * Merges two given sorted arrays into one
 * @return new array containing all elements from a1 and a2, sorted
 */


public class MergedTwoArrays_2_4 {

    public static void main(String[] args) {
        int[] a1 = {2, 2, 2, 4, 5, 6, 7};
        int[] a2 = {1, 3, 4, 5, 6};
        int[] union = mergeArrays(a1, a2);
        for (int i = 0; i < union.length; i++) {
            System.out.print(union[i] + " ");
        }
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int i = 0, j = 0;
        int[] res = new int[a1.length + a2.length];

        while (i < a1.length && j < a2.length)
            res[i + j] = (a1[i] < a2[j]) ? a1[i++] : a2[j++];
        while (i < a1.length)
            res[i + j] = a1[i++];
        while (j < a2.length)
            res[i + j] = a2[j++];
        return res;
    }
}