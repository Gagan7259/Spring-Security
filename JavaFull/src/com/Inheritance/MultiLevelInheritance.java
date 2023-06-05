package com.Inheritance;

class VAdCalci {
    public double power(int n1, int n2) {
        return Math.pow(n1, n2);
    }
}

class AdCalci extends VAdCalci {
    public int multiply(int n1, int n2) {
        return n1 * n2;
    }

    public int dividedby(int n1, int n2) {
        return n1 / n2;
    }
}

class Calculater extends AdCalci {

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Calculater c = new Calculater();
        int r1 = c.add(200, 300);
        int r2 = c.sub(20, 230);
        int r3 = c.multiply(20, 6);
        int r4 = c.dividedby(20, 2000);
        double r5 = c.power(4, 4);

        System.out.println(r1 + "  " + r2 + "  " + r3 + "  " + r4 + " " + r5);
    }
}
