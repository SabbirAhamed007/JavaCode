package com.company;

import java.awt.*;

public class referenceTypefdsfs {

    public static void main(String[] args){

        Point i = new Point(4,7);
        Point j = i;
        i.y = 1;
        System.out.println(i);
        System.out.println(j);
    }
}
