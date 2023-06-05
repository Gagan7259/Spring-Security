package com.Polymorphism;

class D {
    public void show() {
        System.out.println("Its D Class");
    }
}

class E extends D {
    public void show1() {
        System.out.println("Its E Class");
    }
}

class F extends E {
    public int add(int n, int m) {
        return n + m;

    }
}

public class Test1 {
    public static void main(String[] args) {
        D d = new E();
        d.show();
System.out.println("***************************");
        E de=new F();
        de.show1();
        de.show();

    }
}
