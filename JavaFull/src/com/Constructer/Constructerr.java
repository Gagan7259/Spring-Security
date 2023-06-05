package com.Constructer;

class Demo {

    private int age;
    private String name;

    public Demo() {   //default constructer
        age = 23;
        name = "Manoj";
        //its special method
        //named as Class name
        //every time when objects calls constructer automatically exicute
    }

    public Demo(int i, String n) {//parameterized constructer
        age = i;
        name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Constructerr {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.setAge(24);
        d.setName("Gagan");
        System.out.println(d.getAge() + " :" + d.getName());
        Demo d1 = new Demo(18, "Gagan");
        System.out.println(d1.getAge() + " :" + d1.getName());

    }

}

