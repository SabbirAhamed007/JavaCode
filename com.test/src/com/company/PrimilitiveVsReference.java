package com.company;

import java.awt.*;

public class PrimilitiveVsReference {

    public static void main(String[] args){

        Point point1 = new Point(1,2);
        Point point2 = point1;

        point1.x = 5;
        System.out.println(point2);




    }
}
