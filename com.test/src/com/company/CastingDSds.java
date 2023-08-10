package com.company;

import java.util.Scanner;

public class CastingDSds {

    public static void main(String[] args){


        short x = 2;
        int y = x + 6;
        System.out.println(y);

        double c = 2.4;
        double d = c + 5;
        System.out.println(d);


        Scanner inout = new Scanner(System.in);

        System.out.print("Please enter your number: ");

        String myInput = inout.nextLine();

        Double v = Double.parseDouble(myInput);

        int t = 5;

        System.out.println(v + t);



    }
}
