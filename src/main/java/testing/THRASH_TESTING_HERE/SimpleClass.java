package testing.THRASH_TESTING_HERE;

public class SimpleClass {
    public static void main(String[] args) {
        Print myPrint = new Print();
        System.out.println(Print.class.getName());
        System.out.println(myPrint.getClass().getName());

    }
}

class Print{


}