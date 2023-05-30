package com.Loops;

public class ForLoop {
    public static void main(String[] args) {
        /*
        int i = 100;
        // for(Intialization;condition;incr/decr)
        // No of iterations
        for (i = 1; i <= 150; i++) {
            System.out.println();
        }*/

       /* int num = 4;
        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.println(result);
        }*/

        /*
        int num = 20;
        for (int i = 1; i <= 12; i++) {
            int re = num * i;
            System.out.println(re);
        }*/

        for (int i = 1; i <= 7; i++) {
            System.out.println("Day" + i);
            for (int j = 1; j <= 9; j++) {
                System.out.println("      " + (j + 8) + "-" + (j + 9));
            }
        }
    }
}
