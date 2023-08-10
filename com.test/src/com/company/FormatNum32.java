package com.company;

import java.text.NumberFormat;
import java.util.Arrays;

public class FormatNum32 {

    public static void main(String[] args){

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String num = currency.format(343434.457);
        System.out.println(num);


        NumberFormat amount = NumberFormat.getCurrencyInstance();
        String myAmount = amount.format(45.567);
        System.out.println(myAmount);

        NumberFormat numberFormat = NumberFormat.getPercentInstance();
        String numb = numberFormat.format(.34);
        System.out.println(numb);


        String hh = NumberFormat.getCurrencyInstance().format(5623434.678);
        System.out.println(hh);

        String jj = NumberFormat.getPercentInstance().format(.12);
        System.out.println(jj);

        int[] numy = {1,2,3,4,5};
        //numy[2] = 8;
        System.out.println(numy);
        System.out.println(numy.length);

        System.out.println(Arrays.toString(numy));

        int[] numbeu = {1,23,5};

        System.out.println(numbeu.length);

        Arrays.sort(numbeu);
        System.out.println(Arrays.toString(numbeu));

        int[] max = {2,34,324,343,432,4324,5,4,46,54,7657,6,56,435,435,654,6,575,345,534,5,543,53,534,534,534,5};

        Arrays.sort(max);

        System.out.println(Arrays.toString(max));






    }
}
