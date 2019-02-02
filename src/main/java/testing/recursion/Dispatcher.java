package testing.recursion;

public class Dispatcher {
    public static void main(String[] args) {
        A a = new A(10);
        a.print(10);
        System.out.println();
        a.print(5);
        System.out.println();
        System.out.println("==");
        System.out.println();
        //факториал рекурсией
        int res = fact(5);
        System.out.println("res: " + res);
        System.out.println();
        int fibo = fibonazzi(3);
        System.out.println("fibo: " + fibo);
    }

//Вычисляю факториал - рекурсия
    public static int fact(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        return fact(n -1) * n;
    }
    //фибоначи - сумма всех предыдущих чисел...

    public static int fibonazzi(int n) {
        if((n == 1) || (n == 2)) return 1;

        return fibonazzi(n - 1) + (n - 2);
    }


}
