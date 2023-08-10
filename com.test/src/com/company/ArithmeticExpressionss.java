package com.company;

public class ArithmeticExpressionss {

    public static void main(String[] args){

        int result = 10 + 3;
        System.out.println(result);

        int result1 = 10 - 3;
        System.out.println(result1);

        int result2 = 10 / 3;
        System.out.println(result2);

        // in java, if we have to get with decimal number we have to use double or float

        double result4 = (double)10 / (double)3;
        System.out.println(result4);

        float result5 = 10F / 3F;
        System.out.println(result5);


        int result3 = 5 * 5 ;
        System.out.println(result3);

        int x = 1;
        x++;
        System.out.println(x);

        int d = 5;
        int e = d++;
        System.out.println(d);
        System.out.println(e);

        int o = 1;
        int p = ++o;
        System.out.println(o);
        System.out.println(p);

        int s = 6;
        //s = s + 2;cd
        //s += 2;
        //s -= 2;
        s /= 2;
        //s *= 2;

        System.out.println(s);

    }
}
