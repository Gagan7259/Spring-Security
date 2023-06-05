package com.JavaObject;

class Human {
    private String name;

    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name){
        this.name=name;
    }
}

public class Privatekey {
    public static void main(String[] args) {
        Human h = new Human();
        h.setAge(24);
        h.setName("Gagan");
        System.out.println(h.getAge() + ":" + h.getName());
    }
}
