package com.AccesModifiers;
class ok{
    public int getMrk() {
        return mrk;
    }

    private int mrk=200;

}
public class Teacher {
    public static void main(String[] args) {
        Student s=new Student();
        System.out.println(s.marks);

        ok k=new ok();
       int a= k.getMrk();
       System.out.println(a);
    }

}
