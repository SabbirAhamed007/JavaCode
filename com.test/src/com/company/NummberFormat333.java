package com.company;

import java.text.NumberFormat;

public class NummberFormat333 {

    public static void main(String[] args){

        String input = NumberFormat.getCurrencyInstance().format(43242432.434);
        System.out.println(input);


        String myInput = NumberFormat.getPercentInstance().format(.051);

        System.out.println(myInput);

    }
}
