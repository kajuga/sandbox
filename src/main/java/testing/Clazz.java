package testing;


public class Clazz {
    int x = 2;

    public int getX() {
        return x;
    }

    public static void main(String[] args) {
        Clazz c = new SubClass();
        System.out.println(c.x + " " + c.getX());
    }

}

class SubClass extends Clazz{
    int x = 1;

    @Override
    public int getX() {
        return x;
    }
}