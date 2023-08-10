package com.company;

import java.util.Scanner;

public class MortgageCalculators {

    public static void main(String[] args){

        Scanner principleAmount = new Scanner(System.in);
        System.out.print("Please enter the loan amount you want to borrow: ");
        double pa = principleAmount.nextDouble();
        System.out.println(pa);

        Scanner anualInterestRate = new Scanner(System.in);
        System.out.print("Please enter the anual interest rate: ");
        double air = anualInterestRate.nextDouble();
        System.out.println(air);

        Scanner period = new Scanner(System.in);
        System.out.print("Please enter the tenur: ");
        double pe = period.nextDouble() * 12;
        System.out.println(pe);

        double m = pa * ((air * 100)/12);
        System.out.println(m);




        Scanner prinAmnt = new Scanner(System.in);
        System.out.print("Please enter the loan amount: ");
        Float tAmount = prinAmnt.nextFloat();
        System.out.println(tAmount);

        Scanner anlIntRat = new Scanner(System.in);
        System.out.print("Please enter interest rate: ");
        Float rate2 = anlIntRat.nextFloat();
        System.out.println(rate2);

        Scanner perid2 = new Scanner(System.in);
        System.out.print("Please enter the tenuer: ");
        Float pe1 = perid2.nextFloat();
        System.out.println(pe1);

        Float monthlyIns = tAmount * rate2 / pe1;
        System.out.println(monthlyIns);


    }
}
