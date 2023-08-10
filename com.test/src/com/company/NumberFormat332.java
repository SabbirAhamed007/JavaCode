package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class NumberFormat332 {

    public static void main(String[] args){

        NumberFormat iny = NumberFormat.getCurrencyInstance();

        String myNum = iny.format(4342342.4554);
        System.out.println(myNum);


        NumberFormat numberFormat = NumberFormat.getNumberInstance();

        String poi = numberFormat.format(42343242.334);
        System.out.println(poi);

        NumberFormat pppl = NumberFormat.getPercentInstance();
        String kji = pppl.format(.01);
        System.out.println(kji);


        String name = "Sabbir";
        Scanner ino = new Scanner(System.in);

        System.out.print("Please enter your name: ");





    }
}
