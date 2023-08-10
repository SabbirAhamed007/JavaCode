package com.company;

public class ArithmaticExpre {

    public static void main(String[] args){


        int a = (10 + 4) * 8;
        System.out.println(a);

        short x = 1;
        int y = x + 5;
        System.out.println(y);

        double j = 1.3;
        double u = j + 8;
        System.out.println(u);

        int b = (int)j + 0;
        System.out.println(b);

        String i = "5";
        int o = Integer.parseInt(i) + 6;

        System.out.println(o);

        float g = 45.56F;
        System.out.println(Math.round(g));
        System.out.println((int)Math.ceil(g));
        System.out.println(Math.floor(g));

        float res = Math.max(45, 67);
        System.out.println(res);

        double jj = Math.random();
        System.out.println(Math.round(jj*100));


    }
}
