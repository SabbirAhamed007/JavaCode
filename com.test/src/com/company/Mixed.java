package com.company;

import java.awt.*;
import java.util.Date;

public class Mixed {

    public static void main(String[] args){


        int x = 5;

        x = 7;

        int i = x + 7;

        String pp = "Sabbir";
        System.out.println(pp);
        System.out.println(i);

        byte e = 5;
        short u = 7;
        int f = 5;
        long h = 43432L;
        float j = 423432F;
        double uu = 32132131;


        int viewsCount = 42343243;

        viewsCount = 888888;
        System.out.println(viewsCount);


        String name = "Sabbir";

        name = "Ahamed";

        System.out.println(name);

        Date now = new Date();

        System.out.println(now);

        int l = 5;
        int z = l;
        l = 7;
        System.out.println(z);


        String jh = "Sabbir";
        String lk = jh;
        jh = "Ahamed";

        System.out.println(lk);


        Point point = new Point(5, 7);
        Point point2 = point;

        point.x = 8;

        System.out.println(point2);



    }
}
