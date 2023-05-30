package com.JavaObject;

public class Add {
    public int add(int n1, int n2) {
        int a = n1 + n2;
        return a;
    }
}

class object {
    public static void main(String[] args) {
        Add add = new Add();
        int result = add.add(10, 3000);
        System.out.println(result);
    }
}