package com.Arrays;

class Rewards {
    String name;
    int rollno;
    int marks;


}

public class Student {
    public static void main(String[] args) {
        Rewards r1 = new Rewards();
        r1.name = "Gagan";
        r1.marks = 100;
        r1.rollno = 23;


        Rewards r2 = new Rewards();
        r2.name = "Ajay";
        r2.marks = 80;
        r2.rollno = 21;


        Rewards r3 = new Rewards();
        r3.name = "Manoj";
        r3.marks = 90;
        r3.rollno = 22;

        Rewards[] rewarss = new Rewards[3];
        rewarss[0] = r1;
        rewarss[1] = r2;
        rewarss[2] = r3;

        for (int i = 0; i < rewarss.length; i++) {
            System.out.println(rewarss[i].name +"  " + rewarss[i].rollno+" " + rewarss[i].marks);
        }
        System.out.println("*****************************");
        System.out.println("For each");

        for (Rewards r:rewarss){
            System.out.println(r.name+" "+ r.marks+" "+r.rollno);
        }
    }
}
