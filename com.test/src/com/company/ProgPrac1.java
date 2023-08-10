package com.company;

import java.awt.*;
import java.util.Date;

public class ProgPrac1 {

    public static void main(String[] args){

        byte x =1;
        short y = 2;
        int z = 4;
        long a = 8;
        double b= 8;
        float c = 4;
        char i = 'a';

        int age = 35;

        age = 40;

        System.out.println(age);

        long viewCount = 33244234322L;

        boolean isEligible = true;

        String av = "Anand Verd";

        int gh = 30;


        Date now = new Date();

        System.out.println(now);


        int xx = 1;
        int yy = xx;

        xx = 4;

        System.out.println(yy);


        Point point1 = new Point(3, 6);

        Point point2 = point1;

        point1.x = 9;

        System.out.println(point2);


        String jjp  = "Sabbir" + "Ahamed";

        System.out.println(jjp);

        System.out.println(jjp.endsWith("d"));

        System.out.println(jjp.replace("Ahamed" , "STTS"));

        System.out.println(jjp.length());

        System.out.println(jjp.startsWith("k"));

        System.out.println(jjp.indexOf("m"));

        System.out.println(jjp.trim());

        System.out.println(jjp.toUpperCase());

        System.out.println(jjp.lastIndexOf("m"));

        System.out.println(jjp.toLowerCase());

        System.out.println(jjp.compareTo("Quest"));

        String tr = "Hello \"Sabbir\"";

        System.out.println(tr);







    }
}
