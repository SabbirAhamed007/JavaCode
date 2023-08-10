package com.company;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;

public class NumberFormat459943 {

    public static void main(String[] args){


       NumberFormat input = NumberFormat.getCurrencyInstance();

        String esult = input.format(6767.6666);

        System.out.println(esult);
    }
}
