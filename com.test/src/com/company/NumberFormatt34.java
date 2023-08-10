package com.company;

import java.text.NumberFormat;

public class NumberFormatt34 {

    public static void main(String[] args){

        NumberFormat input = NumberFormat.getCurrencyInstance();

        String myInput = input.format(423423432.432432432);

        System.out.println(myInput);


        NumberFormat inp = NumberFormat.getPercentInstance();

        String hh = inp.format(.13);
        System.out.println(hh);


        String myNum = NumberFormat.getCurrencyInstance().format(4333.22F);
        System.out.println(myNum);

    }
}
