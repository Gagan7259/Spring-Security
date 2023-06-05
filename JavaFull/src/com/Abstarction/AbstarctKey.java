package com.Abstarction;

abstract class car {
    // we cant create object of abstract classes
    //  contains abstract classes and normal classes
    // we can create multiple abstract classes

    public abstract void drive();
    public abstract void fly();
    public void playMusic() {
        System.out.println("Play Music");
    }
}

class Lamborgini extends car {  //concreate class
    public void drive() {
        System.out.println("Lambo i Dont Know Hoe tO Drive Can U Help Me");
    }


    public void fly() {
        System.out.println("Yes I can Fly");
    }

}

public class AbstarctKey {
    public static void main(String[] args) {
        car c = new Lamborgini();
        c.drive();
        c.playMusic();
        c.fly();
    }
}
