package testing.recursion;

public class A {
    int[] mas;

    public A(int n) {
        this.mas = new int[n];
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] = (int) Math.round((Math.random() * 100)));
        }
    }

        public void print (int n) {
        if (n == 0) {
            return;
    }
            System.out.print(mas[n - 1] + " ");
        print(n - 1);
        //Начинается жопа почему так
//        print(n--);
    }
}
