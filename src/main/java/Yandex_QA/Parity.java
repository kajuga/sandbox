package Yandex_QA;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Server" only if the class is public. */
    class Ideone{
    public static void main (String[] args) throws java.lang.Exception
    {
        int array[] = {1, 3, 5, 2, 2, 2};

        int[] sortedArray = new int[array.length];
        System.arraycopy(array, 0, sortedArray, 0, array.length);

        for (int i = 0; i < sortedArray.length - 1; i++)
        {
            /* is current odd, if so search next odd */
            if (sortedArray[i] % 2 != 0)
            {
                /* search for next odd and compare */
                for (int j = i + 1; j < sortedArray.length; j++)
                {
                    if ((sortedArray[j] % 2 != 0) && (sortedArray[i] > sortedArray[j]))
                    {
                        int temp = sortedArray[i];
                        sortedArray[i] = sortedArray[j];
                        sortedArray[j] = temp;
                    }
                }
            }
        }
        for (int i: sortedArray)
        {
            System.out.println(i);
        }
    }
}