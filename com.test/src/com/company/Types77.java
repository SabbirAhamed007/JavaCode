package com.company;

import java.awt.*;
import java.util.Date;

public class Types77 {

    public static void main(String[] args){

        byte a = 1;
        short d = 2;
        int b = 4;
        float c = 4;
        long u = 8;
        double p = 8;

        boolean hasIncome = true;



        System.out.println(a);

        int myAge = 30;
        int herAge = myAge;

        System.out.println(herAge);

        char letter = 'A';

        System.out.println(letter);

        byte df = 78;

        Date input = new Date();

        input.getTime();

        System.out.println(input);

        int hh = 1;
        int yy = hh;
        hh = 2;

        System.out.println(yy);

        String jj = "Sabbir";

        String kk = jj;

        jj = "Ahamed";

        System.out.println(kk);

        Point point = new Point(2, 5);

        Point point2 = point;

        point.x = 5;

        System.out.println(point2);

        String mess = "Hello Sabbir !!!" + "Ahamed";

        System.out.println(mess);

        String abe = "fdsfsdsJJJ^^^";

        abe.replace("^^^", "Sabbir");
        System.out.println(abe);



        System.out.println(abe.endsWith("^^^"));

        String uio = "TTT777";

        System.out.println(uio.startsWith("TTT"));

        String jkl = "JJSdsadsja5667***";
        System.out.println(jkl.replace("***", "OOO"));

        System.out.println(jkl.length());
        System.out.println(jkl.trim());
        System.out.println(jkl.indexOf('7'));

        String url = "Hello \"Sabbir\"";

        System.out.println(url);

        String url2 = "C:\\windows\\myfolder";

        System.out.println(url2);






    }
}
