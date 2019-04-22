package javaconceptoftheday.basics.inheritance;

class AAAAA
{
    static int i = 10;

    static void method()
    {
        System.out.println("Static Method");
    }
}

class BBBB extends AAAAA
{

}

public class StaticInitializers
{
    public static void main(String[] args)
    {
        BBBB.method();       //Calling inherited static method

        System.out.println(BBBB.i);    //printing inherited static field.
    }
}
