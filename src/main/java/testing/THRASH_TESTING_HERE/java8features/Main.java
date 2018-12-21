package testing.THRASH_TESTING_HERE.java8features;

public class Main {
    static String a = "Adff    AA";
    static String b = "BddBB";
    static String c = "CCffC";
    static String d = "D  DD";


    public static void main(String[] args) {
        String finish = String.join(", ", a, b, c, d);
        System.out.println(finish);
    }
}
