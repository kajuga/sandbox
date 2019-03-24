package stepic.JAVA_base_course;

/**
 * Merges two given sorted arrays into one
 * @return new array containing all elements from a1 and a2, sorted
 */


public class MergedTwoArrays_2_4 {

    public static void main(String[] args) {
        int[] a1 = {0, 2, 2};
        int[] a2 = {1, 3};
        int[] union = mergeArrays(a1, a2);
        for (int i = 0; i < union.length; i++) {
            System.out.println(union[i]);
        }
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int temp1 = a1.length;
        int temp2 = a2.length;
        int mergesLength = temp1 + temp2;
        int[] merged = new int[mergesLength];
        int i =0, k =0, l= 0;
        while (i < a1.length && k < a2.length) {
            if (a1[i] <= a2[k]) {
                merged[l++] = a1[i++];
            } else {
                merged[l++] = a2[k++];
            }
        }
        if (a1.length != a2.length && a1.length > a2.length) {
            System.arraycopy(a2, a2.length - a1.length , merged, merged.length - a1.length - 1, merged.length - a1.length);
        }

        System.out.println("i = " + i);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        System.out.println(merged.length);
        return merged;

    }
}


// System.arraycopy(sourceArray, 0, dst, 0, sourceArray.length);
//         передаётся исходный массив, начальная позиция копирования в исходном массиве,
//         приёмный массив, начальная позиция копирования в приёмном массиве и количество копируемых элементов.