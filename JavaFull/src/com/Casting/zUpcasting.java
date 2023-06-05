package com.Casting;
class I{
    public int add(int n,int m){
        return  n+m;
    }
}
class J extends  I{
    public int sub(int n,int m){
        return  n-m;
    }
}
public class zUpcasting {
    public static void main(String[] args) {
        I i=new I();
       int a= i.add(23,10);
       System.out.println(a);



         J i1=(J)i;
         int b=i1.sub(20,10);
        System.out.println(b);

    }
}
