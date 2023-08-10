package com.company;

import java.text.NumberFormat;

public class NumberFor56 {


    public static void main(String[] args){


        String input = NumberFormat.getCurrencyInstance().format(4324324.56F);

        System.out.println(input);

        String result = NumberFormat.getPercentInstance().format(.56);

        System.out.println(result);

    }
}
