package com.company;

import java.text.NumberFormat;

public class NumberFormat393 {

    public static void main(String[] args){

        NumberFormat input = NumberFormat.getCurrencyInstance();

        String myInput = input.format(433243243.44);
        System.out.println(myInput);

        NumberFormat abc = NumberFormat.getPercentInstance();

        String jj = abc.format(.15);

        System.out.println(jj);

        String kl = NumberFormat.getCurrencyInstance().format(432432.344);

        System.out.println(kl);



    }
}
