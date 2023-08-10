package com.company;

import java.awt.*;
import java.util.Date;

public class Date33 {

    public static void main(String[] args){

        Date now = new Date();
        now.getTime();
        System.out.println(now);


        Point point1 = new Point(2,5);
        Point point2 = point1;

        point1.y = 9;

        System.out.println(point2);

        String message = "Hi There !!! want to pay my bill." + "Sabbir";


        System.out.println(message.endsWith("Sabbir"));


        String myName = "Sabbir";
        myName.replace('S', 'T');
        System.out.println(myName);

        String num = "fdsfsdfsdfsd&89";

        System.out.println(num.replace("89", "90"));
        System.out.println(num.replace("f","S"));
        System.out.println(num.replace("s","p").indexOf(4));
        System.out.println(num.length());

    }
}
