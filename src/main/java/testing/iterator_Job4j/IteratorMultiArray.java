package testing.iterator_Job4j;

import java.util.Iterator;

public class IteratorMultiArray implements Iterable<Integer> {

    private final int[] values;

    public IteratorMultiArray(int[] values) {
        this.values = values;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator <Integer>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return values.length > index;
            }

            @Override
            public Integer next() {
                return values[index++];
            }
        };
    }

}
