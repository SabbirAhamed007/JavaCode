package com.company;

public class MathClass443 {

    public static void main(String[] args){

        int xc = Math.round(1.20F);

        System.out.println(xc);

        int p = (int)Math.ceil(1.2F);
        System.out.println(p);

        int yy = (int)Math.ceil(123.345F);
        System.out.println(yy);

        int hj = (int)Math.floor(123_343_434.50F);
        System.out.println(hj);

        int hk = Math.min(34,45);
        System.out.println(hk);

        int ppo = (int)Math.max(34433.456F , 31312321.9F);
        System.out.println(ppo);

        double qwe = Math.round(Math.random() * 100);
        int tty = (int)qwe;

        System.out.println(tty);


    }
}
