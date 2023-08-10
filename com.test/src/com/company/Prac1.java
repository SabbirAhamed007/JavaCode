package com.company;

import java.util.Arrays;

public class Prac1 {

    public static void main(String[] args){


        String name = "Hallo \"Sabbir\"";

        System.out.println(name);

        String url = "c:\\windows\\newfolder";

        System.out.println(url);

        int[] nums = {1,3,5};

        System.out.println(Arrays.toString(nums));

        System.out.println(nums.length);


        int[][] num1 = {{345,4,5,5}, {5,4,3}};

        System.out.println(Arrays.deepToString(num1));


        double[] num3 = {4.4234,32432,432,432,423,43,2432,432,432,43,24,32};

        Arrays.sort(num3);
        System.out.println(Arrays.toString(num3));

        int[][] num4 = new int[2][3];

        num4[0][0] = 1;
        num4[0][1] = 2;
        num4[0][2] = 3;
        num4[1][0] = 4;
        num4[1][1] = 5;
        num4[1][2] = 6;

        System.out.println(Arrays.deepToString(num4));


        final float pi = 3.14F;

        //pi = 3;

        System.out.println(pi);


        int result =10 + 3;
        System.out.println(result);

        double res = (double)10 / 5;

        System.out.println(res);


        int x = 1;
        x ++;

        System.out.println(x);

        int y = 1;
         ++ y;
        System.out.println(y);

        int res8 = 1;
        int res9 = res8++;

        System.out.println(res8);

        System.out.println(res9);

        int v = 5;
        v = v + 7;
        System.out.println(v);

        int u = 5;
        u += 10;
        System.out.println(u);

        int ff = 10 + 5 * 5;
        System.out.println(ff);



        short cv = 5;
        int ui = cv + 7;
        System.out.println(ui);

        double rr = 5.6;
        int kk = (int)rr + 67;

        System.out.println(kk);

        String hh = "12";



        int gh = Integer.parseInt(hh) + 5;

        System.out.println(gh);

        String bn = "45.6";

        float kkl = Float.parseFloat(bn) + 56.2F;

        System.out.println(kkl);








    }
}
