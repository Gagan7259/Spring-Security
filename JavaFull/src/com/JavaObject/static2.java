package com.JavaObject;

class Mobil {
    static String name;
    String brand;
    int price;



    static {
        name="phone";
        System.out.println("Its Static Block");

    }

    public void show() {
        System.out.println(name + ": " + brand + " :" + price);
    }
}

public class static2 {
    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("com.JavaObject.Mobil");
       /* Mobil m = new Mobil();
        m.brand = "MI";
        Mobil.name = "Redmi Note 11";
        m.price = 280000;
        m.show();*/
    }

}
