package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCal {

    public static void main(String[] args){

        final byte Month_In_Year = 12;
        final byte Percent = 100;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter total loan amount: ");

        Float loanAmount = input.nextFloat();

        System.out.print("Annual interest rate: ");
        float annualInterest = input.nextFloat();
        float monthlyInterest = annualInterest /Percent/Month_In_Year;

        System.out.print("Number of years for loan: ");

        int loanYear = input.nextInt();

        int numberOfPayment = loanYear * Month_In_Year;

        double mortgage = loanAmount * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayment) -1)/
                (Math.pow(1 + monthlyInterest, numberOfPayment) - 1);


        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("Mortgage : " + mortgageFormatted);






    }
}
