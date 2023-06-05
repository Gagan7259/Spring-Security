package com.Abstarction;

class K {

    int age;

    public void show() {
        System.out.println("Its Ok");
    }

    class L {
        public void config() {
            System.out.println("Dont do ");

        }
    }
}

public class ClassInnerClass {
    public static void main(String[] args) {
        K k = new K();
        int x = k.age = 100;
        System.out.println(x);
        k.show();

        K.L k1=k.new L();
        k1.config();
    }
}
