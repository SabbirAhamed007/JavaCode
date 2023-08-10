package com.company;

import java.util.Scanner;

public class Math54 {

    public static void main(String[] args){

        double x = 45.56;
        double y = 45.65;

        double z = Math.max(x , y);
        double j = Math.min(x , y);
        double i = Math.sqrt(x);
        double k = Math.round(y);
        double o = Math.ceil(x);
        double p = Math.floor(y);

        System.out.println(z);
        System.out.println(j);
        System.out.println(i);
        System.out.println(k);
        System.out.println(o);
        System.out.println(p);

        double q ;
        double w;
        double e;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter side q: ");

        q = input.nextDouble();

        System.out.print("Please enter side w: ");
        w = input.nextDouble();

        e = Math.sqrt((q * q)+(w * w));

        System.out.println("The hypotenuse is: " + e);






    }
}
