package com.company;

import java.text.NumberFormat;

public class FormattingNumbers54 {

    public static void main(String[] args){

        //12,000

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(32432432.432432432);
        System.out.println(result);


        NumberFormat value = NumberFormat.getCurrencyInstance();
        String result2 = currency.format(4223.49);
        System.out.println(result2);


        NumberFormat percentage = NumberFormat.getPercentInstance();
        String jj = percentage.format(.56);
        System.out.println(jj);

        String percent = NumberFormat.getPercentInstance().format(.1);
        System.out.println(percent);

        String result1 = NumberFormat.getPercentInstance().format(1.2);
        System.out.println(result1);

    }
}
