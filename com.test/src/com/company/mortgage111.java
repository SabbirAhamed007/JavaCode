package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class mortgage111 {

    public static void main(String[] args){


        final byte monthsInYear = 12;
        final byte percentage = 100;

        Scanner loadAmount = new Scanner(System.in);
        System.out.print("Please enter total loan amount: ");
        int loanAmt = loadAmount.nextInt();

        Scanner totalYear = new Scanner(System.in);
        System.out.print("Please enter the number of years: ");
        int numYear = totalYear.nextInt();

        int numberOfPayment = numYear * monthsInYear;

        Scanner intRateYearly = new Scanner(System.in);
        System.out.print("Please enter yearly interest rate: ");
        float yearlyInt = intRateYearly.nextFloat();

        float monthlyIntRate = yearlyInt / percentage / monthsInYear;

        double mortgage = loanAmt * (monthlyIntRate * Math.pow(1 + monthlyIntRate, numberOfPayment))
                / (Math.pow(1 + monthlyIntRate, numberOfPayment)) - 1;

        String MortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage payment per month: " + MortgageFormatted);





















    }
}
