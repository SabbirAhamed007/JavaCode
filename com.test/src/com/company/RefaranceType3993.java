package com.company;

import java.awt.*;
import java.util.Date;

public class RefaranceType3993 {

    public static void main(String[] args){

        Date toDate = new Date();

        System.out.println(toDate);


        Point point1 = new Point(2,5);

        Point point2 = point1;

        point1.x = 9;

        System.out.println(point2);

    }
}
