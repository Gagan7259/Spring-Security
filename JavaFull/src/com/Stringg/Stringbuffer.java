package com.Stringg;

public class Stringbuffer {
    // thread safe
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Gagan");
        stringBuffer.append("Reddy");
        stringBuffer.delete(2, 3);
        stringBuffer.insert(3, "NTR");
        System.out.println(stringBuffer.capacity());
        System.out.println(stringBuffer.length());
        System.out.println(stringBuffer);
    }
}
