package com.Statements;

public class TernaryOp {
    public static void main(String[] args) {
        int a = 101;
        int reult = 0;

      /*  if (a%2==0)
            System.out.println("Even Num");
        else
            System.out.println("Odd Num");*/

        reult = a % 2 == 0 ? 10 : 20;
        System.out.println(reult);
    }
}
