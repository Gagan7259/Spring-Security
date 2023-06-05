package com.Abstarction;

abstract class SVVS {
    public abstract void show();
    public abstract void config();
}
    public class InnerAbstract {
        public static void main(String[] args) {
            SVVS sv=new SVVS() {

                public void show() {
                 System.out.println("SvvS Pg Is HEre");
                }

                public void config() {
                    System.out.println("Config File Here");
                }
            };
            sv.show();
            sv.config();
        }

    }
