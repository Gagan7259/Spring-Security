package com.AccesModifiers;

 class T1 {
     //if we declare class as final we cant inheritance to the another class
    public  void show() {
        System.out.println("T1 show");
    }

    public  int add(int n1, int n2) {
        return n1 + n2;
    }
}
class T2 extends  T1{
    public final void show() {
        System.out.println("T1 show");
    }
}

public class finalmethod {
    public static void main(String[] args) {
        T2 t=new T2();
      int a=  t.add(20,30);
      System.out.println(a);
    }
}
