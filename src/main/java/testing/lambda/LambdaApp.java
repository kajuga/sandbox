package testing.lambda;

public class LambdaApp {
    static int z = 6;
    static int zz = 5;
    int om = 15;

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        String s = "AAA";


        Calcu clc = (x, y) -> x + y;
        Calcu clc2 = (x, y) -> x * y;

        System.out.println(clc.calculate(5, 3) + clc2.calculate(5, 5));
        System.out.println();
        CalcuNoParameters cnp = () -> a + b;
        CalcuNoParameters cnp2 = () -> z + zz;
        CalcuNoParameters cnp3 = () -> z + b;
        CalcuNoParameters cnp4 = () -> s.length() + b;
        System.out.println(cnp.calcNoParam() + " " + cnp2.calcNoParam() + " " + cnp3.calcNoParam() + " " + cnp4.calcNoParam());







    }






}

