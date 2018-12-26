package testing.lambda;

public class Main {

    public static void main(String[] args) {

        Calcu clc = (x, y) -> x + y;
        Calcu clc2 = (x, y) -> x - y;
        Calcu clc3 = (x, y) -> x * y;
        System.out.println(clc.calculate(5, 5) + " " + clc2.calculate(15, 5) + " " + clc3.calculate(3, 5));
        System.out.println();


        System.out.println();
        CalcuNoParameters cnp = () -> 25 -20;

        System.out.println(cnp.calcNoParam());


        PrinterInterface prnt = s -> System.out.println(s);
        prnt.print("!!!!!!!");









    }


}
