package testing.lambda;

public class LambdaApp {
    public static void main(String[] args) {
        int[] arr = {-5, -4, -3, -2, -1, 1, 2, 3, 4, 5, 6, 7};

        ExpressionHelper expr = new ExpressionHelper();

        Expression expr2 = ExpressionHelper::isPositive;
        Expression expr3 = ExpressionHelper::isNegatve;

        calculate(arr, expr::isChet);
        System.out.println();
        calculate(arr, ExpressionHelper::isPositive);
        System.out.println();
        calculate(arr, ExpressionHelper::isNegatve);
        System.out.println();
        calculate(arr, expr3);

    }

    private static void calculate (int[] arr, Expression exp) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if(exp.isEqual(arr[i])) {
                System.out.print(arr[i] + " ");
        }
        }
    }
}

 class ExpressionHelper {
    boolean isChet(int x) {
        return x % 2 == 0;
    }
    static boolean isPositive(int x) {
        return x > 0;
    }
    static boolean isNegatve(int x) {
        return x < 0;
    }
}

interface Expression{
    boolean isEqual(int x);
}