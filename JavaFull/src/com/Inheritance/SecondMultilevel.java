package com.Inheritance;

class A {
    public String show() {
        return "Hello Good Morning";
    }
}

class B extends A {
    public String Tfn() {
        return "Hello Tiffen Ready ";
    }
}

class C extends B {
    public String Launch() {
        return "Hey U want Launch";
    }
}

public class SecondMultilevel {
    public static void main(String[] args) {
        C c = new C();
        String a1 = c.Launch();
        String a2 = c.show();
        String a3 = c.Tfn();
        System.out.println(a1+" "+a2+" "+a3);
    }
}
