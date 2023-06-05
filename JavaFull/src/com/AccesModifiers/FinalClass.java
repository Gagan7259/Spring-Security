package com.AccesModifiers;

class T3 {
    public  void show() {
        System.out.println("T1 show");
    }

    public  int add(int n1, int n2) {
        return n1 + n2;
    }
}
class T4 extends  T3{
    public final void show() {
        System.out.println("T1 show");
    }
}

public class FinalClass {
    public static void main(String[] args) {
        T4 t=new T4();
        int a=  t.add(20,30);
        System.out.println(a);
    }
}
