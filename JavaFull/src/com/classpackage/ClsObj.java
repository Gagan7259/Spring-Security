package com.classpackage;

import java.util.Objects;

class LaaPtop {
    String model;
    int price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LaaPtop laaPtop = (LaaPtop) o;
        return price == laaPtop.price && Objects.equals(model, laaPtop.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price);
    }

    public String toString() {
        return model + ":" + price;
    }


}

public class ClsObj {
    public static void main(String[] args) {
        LaaPtop l = new LaaPtop();
        l.model = "Lenova";
        l.price = 2000;

        LaaPtop l1 = new LaaPtop();
        l1.model = "Lenova";
        l1.price = 2000;
        System.out.println(l);

        System.out.println(l.equals(l1));
    }
}
