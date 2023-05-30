package com.JavaObject;

class caluclater {
    int n = 4;
    int num = 8;

    public int add(int n1, int n2) {
        int r = n1 + n2;
        return r;
    }
}

public class Objects {
    public static void main(String[] args) {

        caluclater caluclater = new caluclater();
        int res = caluclater.add(10, 20);
        System.out.println(res);
    }
}


//object-oriented programing
//object= properties and behaviours

