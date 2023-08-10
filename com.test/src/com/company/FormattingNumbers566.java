package com.company;

import java.text.NumberFormat;

public class FormattingNumbers566 {

    public static void main(String[] args){

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(32312.32321);
        System.out.println(result);

        NumberFormat currType = NumberFormat.getCurrencyInstance();
        String report = currType.format(4243242);
        System.out.println(report);

        NumberFormat numberFormat = NumberFormat.getPercentInstance();
        String report3 = numberFormat.format(.12);
        System.out.println(report3);


        String jj = NumberFormat.getCurrencyInstance().format(3543535.432432);
        System.out.println(jj);

    }
}
