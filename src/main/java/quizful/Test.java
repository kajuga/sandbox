package quizful;

class Test {
    public static void main(String[] args){
        int x = 1;
        Integer y = new Integer(x);
        int [] z = {x};

        func(x, y, z);

        System.out.print(x);
        System.out.print(y);
        System.out.println(z[0]);
    }

    static void func (int x, Integer y, int[] z) {
        x++;
        y++;
        z[0]++;
    }
}