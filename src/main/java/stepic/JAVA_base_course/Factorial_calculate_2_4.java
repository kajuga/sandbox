package stepic.JAVA_base_course;


import java.math.BigInteger;

/**
 * Calculates factorial of given <code>value</code>.
 * @return factorial of <code>value</code>
 */

public class Factorial_calculate_2_4 {

    public static void main(String[] args) {
        System.out.println(factorial(3));

    }
    public static BigInteger factorial(int value) {
        BigInteger temp = BigInteger.valueOf(1);
        for (int i = 1; i<=value; i++) {
            temp = temp.multiply(BigInteger.valueOf(i));
        }
        return temp;
    }

    public static BigInteger factorialTwo(int value) {
        if (value == 1 || value == 0) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(value).multiply(factorial(value - 1));
        }
    }
}