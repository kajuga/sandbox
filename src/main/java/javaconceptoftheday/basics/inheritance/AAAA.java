package javaconceptoftheday.basics.inheritance;

class A
{
    A()
    {
        //B();      There is no statement in java to call subclass constructor
        System.out.println("Class A Constructor");
    }
}

class B extends A
{
    B()
    {
        super();        // calling statement to super class constructor
        System.out.println("Class B Constructor");
    }
}