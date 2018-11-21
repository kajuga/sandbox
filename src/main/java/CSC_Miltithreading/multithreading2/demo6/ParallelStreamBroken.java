package CSC_Miltithreading.multithreading2.demo6;

import java.util.Arrays;

public class ParallelStreamBroken {

    public static void main(String[] args) {
        int[] array = Commons.prepareArray();


        long startTime = System.currentTimeMillis();

        double[] sum = new double[1];
//        DoubleAdder sum = new DoubleAdder();
        Arrays.stream(array)
                .parallel()
                .mapToDouble(Commons::function)
//                .forEach(sum::add);
                .forEach(x -> sum[0] += x);

        long endTime = System.currentTimeMillis();

        System.out.println("sum = " + sum[0]);
//        System.out.println("sum = " + sum);
        System.out.println("time = " + (endTime - startTime) + "ms");
    }
}
