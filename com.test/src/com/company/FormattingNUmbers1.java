package com.company;

import java.text.NumberFormat;

public class FormattingNUmbers1 {

        public static void main(String[] args){

                NumberFormat currency = NumberFormat.getCurrencyInstance();

                String result = currency.format(42343.423432);
                System.out.println(result);


                String per = NumberFormat.getPercentInstance().format(.01);
                System.out.println(per);







        }

}
