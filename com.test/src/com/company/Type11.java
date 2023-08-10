package com.company;

import java.awt.*;
import java.util.Date;

public class Type11 {

    public static void main(String[] args){

        int age = 12;
        int herAge = 10;

        age = age + 5;
        System.out.println(age);

        Date time = new Date();
        System.out.println(time);

        Point point1 = new Point(2,5);
        Point point2 = point1;
        point2.x = 7;

        System.out.println(point1);
        System.out.println(point2);

        String mess = "Hello Dhaka." + " My Dhaka.";
        System.out.println(mess);

        System.out.println(mess.endsWith("a"));
        System.out.println(mess.startsWith("H"));
        System.out.println(mess.replace("My", "Ours"));
        System.out.println(mess.length());


    }
}
