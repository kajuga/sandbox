package testing.lambda.testcode01;

public class Main {
    static int a = 2;
    static int b = 5;


    public static void main(String[] args) {
        Calculate<Integer> calc = (x, y) -> x * y;
        System.out.println(calc.Summator(2, 3));

        Printer prnt = (s -> System.out.println(s));
        prnt.Printator("!!!!");

        CalculateNoParam cnopar = () -> (a + b);
        System.out.println(cnopar.calculator());



    }







}
