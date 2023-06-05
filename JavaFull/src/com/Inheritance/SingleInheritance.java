package com.Inheritance;

class cal {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        cal c = new cal();
        int r1 = c.add(200, 300);
        int r2 = c.sub(20, 230);
        System.out.println(r1 + "  " + (r2));
    }
}
