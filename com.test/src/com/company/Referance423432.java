package com.company;

import java.awt.*;
import java.util.Date;

public class Referance423432 {

    public static void main(String[] args){

        Date now = new Date();

        System.out.println(now);

        Point point1 = new Point(2,5);

        Point point2 = point1;

        point1.x = 9;

        System.out.println(point1);
        System.out.println(point2);




    }
}
