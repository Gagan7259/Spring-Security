package com.Abstarction;
class COMputer{
    public void code(){

    }
}
class Desktop {
    public void Code() {
        System.out.println("Code , Run , Compile");
    }
}
class Laptop extends  COMputer{

}

class Developer {
    public void devApp(Desktop d) {
        d.Code();
    }
}

public class Programmer {
    public static void main(String[] args) {
        Desktop d1 = new Desktop();

        Developer d2 = new Developer();
        d2.devApp(d1);
    }
}
