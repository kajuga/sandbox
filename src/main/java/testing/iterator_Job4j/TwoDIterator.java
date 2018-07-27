package testing.iterator_Job4j;

import java.util.LinkedList;
import java.util.Queue;

public class TwoDIterator {
    int[][] array;
    int outerCursor;
    int lastArrayLen;
    int totalElems;
    int tracker = 1;
    Queue<Integer> myQueue = new LinkedList<>();

    public TwoDIterator(int[][] arr) {
        this.array = arr;
        this.outerCursor = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                totalElems += 1;
            }
        }
        for (int i = 0; i < array[0].length; i++) {
            myQueue.add(array[0][i]);
        }
    }

    public boolean hasNext() {
        return array.length > outerCursor && totalElems >= tracker;
    }

    public Integer next() {
        if (myQueue.isEmpty()) {
            outerCursor++;
            for (int i = 0; i < array[outerCursor].length; i++) {
                myQueue.add(array[outerCursor][i]);
            }
            if (!myQueue.isEmpty()) {
                tracker++;
                return myQueue.remove();
            }
        } else {
            tracker++;
            return myQueue.remove();
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 1, 3 }, { 1, 2, 5 } };
        TwoDIterator iter = new TwoDIterator(arr);
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}