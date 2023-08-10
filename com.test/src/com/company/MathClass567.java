package com.company;

public class MathClass567 {

    public static void main(String[] args){

        int a = Math.round(1.1F);
        System.out.println(a);

        int s = (int)Math.ceil(2.1F);
        System.out.println(s);

        int d = (int) Math.floor(1.2F);
        System.out.println(d);

        int f = (int)Math.floor(2.6F);
        System.out.println(f);

        float g = (int)Math.max(2.5F, 3.6F);
        System.out.println(g);

        int j = Math.round(12.34F);
        System.out.println(j);

        int k = Math.max(34, 54);
        System.out.println(k);

        int m = Math.round(34.5F);
        System.out.println(m);

        int hh = (int)Math.ceil(34.5F);
        System.out.println(hh);

        int gg = (int)Math.floor(1.23F);
        System.out.println(gg);

        int cc = (int)Math.max(23.4F, 45.60F);
        System.out.println((cc - gg) * hh);

        double kk = Math.random() * 100;
        System.out.println((int)Math.round(kk * gg - hh));





    }
}
