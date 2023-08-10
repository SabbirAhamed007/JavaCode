package com.company;

import java.awt.*;

public class PointGG {

    public static void main(String[] args){

        Point input = new Point(3,8);

        Point input2 = input;

        input.x = 7;

        System.out.println(input);
        System.out.println(input2);

        int x = 5;
        int y = x;

        x = 7;

        System.out.println(y);






    }
}
