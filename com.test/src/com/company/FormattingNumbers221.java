package com.company;

import java.text.NumberFormat;

public class FormattingNumbers221 {

    public static void main(String[] args){

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String jj = currency.format(32432434.423432);
        System.out.println(jj);


        NumberFormat numberFormat = NumberFormat.getPercentInstance();

        String hh = numberFormat.format(.01);
        System.out.println(hh);


        String per = NumberFormat.getPercentInstance().format(.15);
        System.out.println(per);


        NumberFormat yy = NumberFormat.getCurrencyInstance();
        String uio = currency.format(321312.312);
        System.out.println(uio);

        String bale = NumberFormat.getPercentInstance().format(1.2);
        System.out.println(bale);


    }
}
