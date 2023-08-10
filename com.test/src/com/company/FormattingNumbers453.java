package com.company;

import java.text.NumberFormat;

public class FormattingNumbers453 {

    public static void main(String[] args){

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(423432.3443);
        System.out.println(result);

        NumberFormat Per = NumberFormat.getPercentInstance();
        String ter = currency.format(32321312.344);
        System.out.println(ter);

        NumberFormat gg = NumberFormat.getNumberInstance();
        String sde = gg.format(3213213.45);
        System.out.println(sde);

        String yut = NumberFormat.getCurrencyInstance().format(32312312.45);
        System.out.println(yut);


    }
}
