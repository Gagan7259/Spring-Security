package com.JavaObject;

class Mobile {
    String name;
    int price;
    String brand;

    public void show() {
        System.out.println(name + " " + brand + ":" + price);
    }
}


public class staticKey {
    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.brand = "MI";
        m.name = "RedMi Note * Pro";
        m.price = 18000;


        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        m1.name = "Iphone 8";
        m1.price = 500000;

        Mobile m2 = new Mobile();
        m2.brand = "Lava";
        m2.name = "Lava Agni";
        m2.price = 20000;

        m.show();
        m1.show();
        m2.show();
    }
}
