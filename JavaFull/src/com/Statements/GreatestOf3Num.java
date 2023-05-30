package com.Statements;

public class GreatestOf3Num {
    public static void main(String[] args) {
        int x = 100;
        int y = 200;
        int z = 300;
        if (x > y && x > z) {
            System.out.println("X is Geater Value");
        } else if (y > x && y > z) {
            System.out.println("Y is the greatest Number");
        } else {
            System.out.println("Z is the Greatest Number");
        }
    }
}
