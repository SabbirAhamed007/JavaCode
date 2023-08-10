package com.company;

import java.awt.*;
import java.util.Date;

public class Test363 {

    public static void main(String[] args){


        int age = 30;
        String name = "Sabbir";
        age = 30 + 5;

        System.out.println(age);


        Date now = new Date();
        System.out.println(now);


        int x = 1;
        int y = x;
        x = 2;
        System.out.println(y);

        Point input = new Point(1, 4);
        Point in2 = input;
        input.x = 5;

        System.out.println(in2);

        String myIn = "Sabbir" + "!!!";
        System.out.println(myIn.endsWith("!!!"));

        System.out.println(myIn.startsWith("S"));
        System.out.println(myIn.replace("r" , "E"));
        System.out.println(myIn.length());
        System.out.println(myIn.indexOf("a"));
        System.out.println(myIn.toUpperCase());
        System.out.println(myIn.toLowerCase());
        System.out.println(myIn.trim());





    }
}
