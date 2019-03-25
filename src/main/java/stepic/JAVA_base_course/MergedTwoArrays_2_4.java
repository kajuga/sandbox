package stepic.JAVA_base_course;

/**
 * Merges two given sorted arrays into one
 * @return new array containing all elements from a1 and a2, sorted
 */


public class MergedTwoArrays_2_4 {

    public static void main(String[] args) {
        int[] a1 = {0, 2, 2, 4, 5, 6, 7};
        int[] a2 = {1, 3, 3, 3};
        int[] union = mergeArrays(a1, a2);
        for (int i = 0; i < union.length; i++) {
            System.out.print(union[i] + " ");
        }
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int temp1 = a1.length;
        int temp2 = a2.length;
        int mergedLength = temp1 + temp2;

        int[] merged = new int[mergedLength];
        int i = 0, j = 0;

        for (int k = 0; k < mergedLength; k++) {
            if (i > a1.length - 1) {
                int a = a2[j];
                merged[k] = a;
                j++;
        }
        else if (j > a2.length - 1) {
                int a = a1[i];
                merged[k] = a;
                i++;
            }
            else if (a1[i] < a2[j]) {
                int a = a1[i];
                merged[k] = a;
                i++;
            } else {
                int b = a2[j];
                merged[k] = b;
                j++;
            }
        }
        return merged;
    }
}