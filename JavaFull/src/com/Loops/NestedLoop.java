package com.Loops;

public class NestedLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 4) {
            System.out.println("Hello" + i);
            int j = 1;
            while (j <= 3) {
                System.out.println("Macha" + j);
                j++;
            }
            i++;
        }
    }
}
