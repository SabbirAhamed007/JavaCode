package com.company;

import java.awt.*;

public class PremilitiveType34 {

    public static void main(String[] args){


        short x = 1;
        Short y = x;
        x = 3;

        System.out.println(y);

        Point h = new Point(3, 6);
        Point g = h;
        h.x =67;

        System.out.println(g);

        String name = "Sabbir";

        System.out.println(name.toLowerCase());
        System.out.println(name.startsWith("S"));
        System.out.println(name.endsWith("y"));
        System.out.println(name.replace("r", "J"));
        System.out.println(name.indexOf("i"));






    }
}
