package com.JavaObject;

public class Test {
    public static void main(String[] args) {
        MethodOverLoading methodOverLoading = new MethodOverLoading();
        int a1 = methodOverLoading.add(1, 8);
        int b1 = methodOverLoading.add(2, 3, 4);
        double c1 = methodOverLoading.add(10.2, 3, 5);
        System.out.println("Add with 2 intgers" + a1);
        System.out.println("Add with 3 intgers" + b1);
        System.out.println("Add with 1 double & 2 intgers" + c1);

    }
}
