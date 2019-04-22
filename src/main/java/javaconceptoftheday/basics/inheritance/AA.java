package javaconceptoftheday.basics.inheritance;

class AA
{
    AA()
    {
        //BB();      There is no statement in java to call subclass constructor
        System.out.println("Class A Constructor");
    }
}

class BB extends AA
{
    BB()
    {
        super();        // calling statement to super class constructor
        System.out.println("Class B Constructor");
    }
}

class Main {
    public static void main(String[] args) {
        BB bb = new BB();
        AA aa = new AA();
    }

}