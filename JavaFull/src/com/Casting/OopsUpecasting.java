package com.Casting;
class G{
    public void show(){
        System.out.println( "Hello");
    }
}
class H extends  G{
    public void show1(){
        System.out.println( "Good Day");
    }
}
public class OopsUpecasting {
    public static void main(String[] args) {
        G g=new H();
        g.show();

        H h=(H)g;
        h.show1();
    }
}
