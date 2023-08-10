package com.company;

import java.text.NumberFormat;

public class FormattingNumbers64523 {

    public static void main(String[] args){

        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();

        String result = currencyInstance.format(32321321.223);

        System.out.println(result);


        NumberFormat instance = NumberFormat.getPercentInstance();

        String myNumber = instance.format(.01);
        System.out.println(myNumber);


        String jj = NumberFormat.getPercentInstance().format(423432.423);
        System.out.println(jj);

        String nn = NumberFormat.getCurrencyInstance().format(2321.31232);
        System.out.println(nn);
    }
}
