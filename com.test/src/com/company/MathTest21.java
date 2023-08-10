package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MathTest21 {

    public static void main(String[] args){

        double x = 3.14;
        double y = -10;

        double z = Math.max(x , y);

        System.out.println(z);

        float j = 12.34F;
        float k = 12.33F;

        float i = Math.min(j, k);
        System.out.println(i);

        double o = Math.abs(y);

        System.out.println(o);

        double op = Math.sqrt(j);

        System.out.println(op);

        double kj = Math.round(x);
        System.out.println(kj);


        double lk = Math.ceil(x);
        System.out.println(lk);

        double tr = Math.floor(x);
        System.out.println(tr);





        try {
            double vb;
            double nb;
            double qw;

            Scanner inout = new Scanner(System.in);

            System.out.print("Please enter vb: ");

            vb = inout.nextDouble();


            System.out.print("Please enter nb: ");

            nb = inout.nextDouble();


            qw = Math.sqrt((vb * vb) + (nb * nb));

            System.out.println(qw);

        }

        catch (InputMismatchException e){


            System.out.println("Please enter \".\" carefully");
        }



    }


}
