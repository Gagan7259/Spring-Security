package com.Constructer;

class A  extends  Object{
    public A() {
        super();
        System.out.println("A constructer");
    }

    public A(int m) {
        super();
        System.out.println("A INTEGER constructer");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("B constructer");
    }

    public B(int n) {
        this();
        System.out.println("B Constructor B INTEGER");
    }
}

public class Constr2 {
    //  every constructer in java own method
    //  every constructer have SUPER() method even if dont mention
    // every class in java Extends the OBJECT class
    //every class in java is object

    //this keyword will be execute the same class constructor

    public static void main(String[] args) {
        // A  b=new A(7);
        // B b1=new B(5);
        B b2 = new B(5);

    }
}
