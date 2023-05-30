package com.JavaObject;

public class calci {
    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
}

class demo {
    public static void main(String[] args) {
        calci caluclater = new calci();
        int a1 = caluclater.add(20, 30, 40);
        System.out.println(a1);
    }
}
