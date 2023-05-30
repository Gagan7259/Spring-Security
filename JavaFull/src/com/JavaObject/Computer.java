package com.JavaObject;

class A {
    public void playmusic() {
        System.out.println("Noting Working Buddy");
    }

    public String getpen(int cost, String name) {
        if (cost >= 100) {
            return "Pen";
        }
        return "Nothing Pora REy";
    }
}

public class Computer {
    public static void main(String[] args) {
        A a = new A();
        // a.playmusic();
        String str = a.getpen(200, "Gagan");
        System.out.println(str);
    }
}
