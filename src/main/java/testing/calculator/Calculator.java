package testing.calculator;

public class Calculator {

    public interface Operation {
        double calc(int left, int right);
    }

    public void multiple(int start, int finish, int value, Operation op) {
        for (int index = start; index != finish; index++) {
            System.out.println(
                    op.calc(value, index)
            );
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.multiple(
                0, 10, 2,
                new Operation() {
                    @Override
                    public double calc(int left, int right) {
                        return left * right;
                    }
                }
        );
    }
}