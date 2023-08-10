package com.company;

import java.text.NumberFormat;

public class NumberFormat33 {

    public static void main(String[] args){

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(423423.432432);
        System.out.println(result);

        NumberFormat gg = NumberFormat.getCurrencyInstance();

        String hh = gg.format(424324312312.2344);
        System.out.println(hh);


        String percentInstance = NumberFormat.getPercentInstance().format(.4);


        System.out.println(percentInstance);

    }
}
