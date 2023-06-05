package com.JavaObject;

public class MethodOverLoading {
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, int b, int c) {
        return a + b + c;
    }
}

