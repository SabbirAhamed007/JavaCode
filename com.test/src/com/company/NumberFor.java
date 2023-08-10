package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class NumberFor {

    public static void main(String[] args){

        NumberFormat input = NumberFormat.getCurrencyInstance();

        String myINput = input.format(32212.33F);

        System.out.println(myINput);

        NumberFormat oi = NumberFormat.getPercentInstance();

        String abe = oi.format(42343243.432424f);

        System.out.println(abe);

        String mio = NumberFormat.getCurrencyInstance().format(4342342.45);

        System.out.println(mio);


        int hg = Math.round(4234324.33F);
        System.out.println(hg);

        int shd = (int)Math.ceil(332112.22F);
        System.out.println(shd);

        float yui = (Float)Math.max(32.45F, 3232.34F);

        System.out.println(yui);

        int ddf = Math.min(3434, 2332);

        System.out.println(ddf);


        int esult =  (int)Math.round(Math.random() * 100);

        System.out.println(esult);

        double pp = 4.5;
        double oo = pp + 4;
        System.out.println(oo);

        double ki = 78.76;
        int ui = (int) ki + 45;

        System.out.println(ui);

        Scanner inpu = new Scanner(System.in);

        System.out.print("Please enter your number: ");

        String myIUO = inpu.nextLine();


        int you = Integer.parseInt(myIUO) + 34;

        System.out.println(you);












    }

}
