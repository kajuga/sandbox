package javaconceptoftheday.basics.inheritance;

class AAA
{
    static
    {
        System.out.println("Class A SIB");
    }

    int i;

    {
        System.out.println("Class A IIB");
    }

    AAA()
    {
        System.out.println("Class A Constructor");
    }
}

class BBB extends AAA
{
    int j;
}

class MainClass
{
    public static void main(String[] args)
    {
        BBB b = new BBB();
    }
}