package com.Operaters;

public class Increment {
    public static void main(String[] args) {
        int num = 100;
        /* Post Increment 1st fetch the value and  increment
         *
         *  Pre Increment 1st Increment value and then gave Result*/
        //int result=++num;
        int result = num++;

        System.out.println(result);
    }
}
