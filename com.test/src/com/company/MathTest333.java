package com.company;

import java.text.NumberFormat;

public class MathTest333 {

    public static void main(String[] args){

        int x = 10 + 3 * 2;
        System.out.println(x);

        int y = (10 + 3) * 2;

        System.out.println(y);

        short p = 2;
        int q = p + 5;
        System.out.println(q);

        float o = 3.4F;

        int i = (int)o + 1;

        System.out.println(i);

        String t = "2";
        int e = Integer.parseInt(t) + 3;

        System.out.println(e);

        String w = "2.5";
        float z = Float.parseFloat(w) + 3.6F;
        System.out.println(z);


        int gg = Math.round(3.4F);
        System.out.println(gg);

        int go = (int)Math.ceil(333.45F);
        System.out.println(go);


        int ie = Math.round((int) (Math.random() * 100)) ;
        System.out.println(ie);






    }
}
