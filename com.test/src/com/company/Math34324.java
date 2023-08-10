package com.company;

public class Math34324 {

    public static void main(String[] args){

        int ii = Math.round(1.45F);
        System.out.println(ii);

        int o = (int)Math.ceil(34.56F);

        System.out.println(o);

        int i = (int)Math.floor(34.56F);
        System.out.println(i);

        float w = Math.max(56.6F, 56.7F);
        System.out.println(w);

        int p = Math.min(5, 8);
        System.out.println(p);

        double j =  Math.ceil(Math.random() * 10);
        System.out.println(j);

        int q =  (int) Math.round(Math.random() * 100);
        System.out.println(q);
    }
}
