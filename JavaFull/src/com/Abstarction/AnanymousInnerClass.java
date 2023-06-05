package com.Abstarction;

class Sai {
    public void show() {
        System.out.println("Sai Beats Rakesh");
    }
}
class Raki extends  Sai{

    public void show() {
       System.out.println("Raki Beaten By Sai");
    }
}

public class AnanymousInnerClass {
    public static void main(String[] args) {
        Sai s = new Sai(){
            public void show() {
                System.out.println("Sai Beat By Rakhi");
            }
        };
        s.show();
    }
}
