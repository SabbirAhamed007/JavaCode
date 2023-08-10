package com.company;

import java.text.NumberFormat;

public class MathClass35 {

    public static void main(String[] args){


        int num = Math.round(4.5F);

        System.out.println(num);

        int num2 = (int) Math.ceil(4.5F);

        System.out.println(num2);

        int num3 =(int) Math.floor(4.5F);

        System.out.println(num3);

        int num4 = Math.max(56, 78);
        System.out.println(num4);

        int num5 = Math.min(56, 32);

        System.out.println(num5);

        int num6 = (int)Math.round(Math.random() * 100);

        System.out.println(num6);


        int num7 = (int) (Math.random() * 100);

        System.out.println(num7);


        NumberFormat currency = NumberFormat.getCurrencyInstance();

        String result = currency.format(432432432.56);

        System.out.println(result);



        NumberFormat tum = NumberFormat.getCurrencyInstance();

        String amount = tum.format(43324.33);

        System.out.println(amount);

        NumberFormat jun = NumberFormat.getCurrencyInstance();

        String hum = jun.format(332322.455);
        System.out.println(hum);

        NumberFormat numberFormat = NumberFormat.getPercentInstance();
        String num8 = numberFormat.format(.34);
        System.out.println(num8);

        String num9 = NumberFormat.getCurrencyInstance().format(.4);
        System.out.println(num9);

    }
}
