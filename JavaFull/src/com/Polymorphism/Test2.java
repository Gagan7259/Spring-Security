package com.Polymorphism;

class Computer {
    public void show() {
        System.out.println("A show");
    }

}

class Laptop extends Computer {
    public void show() {
        System.out.println("Laptop show");
    }

}

class Laptop1 extends Computer {
    public void show() {
        System.out.println("Laptop1 show");
    }

}

public class Test2 {
    public static void main(String[] args) {
        Computer c = new Laptop();
        c = new Laptop();
        c.show();

        c = new Laptop1();
        c.show();
    }
}
