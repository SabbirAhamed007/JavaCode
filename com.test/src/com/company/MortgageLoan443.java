package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageLoan443 {

    public static void main(String[] args) {


        //Principal : 1000000
        //Annual Interest Rate : 3.5
        //Period : 22

        // Mortgage load calculation process  M = P (r(1+r)n) / (1 + r)n -1;

        final byte Month_In_Year = 12;
        final byte Percent = 100;



        int TotalMonths = 22 * 12;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your principal amount: ");
        int principal = scanner.nextInt();

        System.out.print("Annual interest rate: ");
        float yearlyInterestRate = scanner.nextFloat();
        float monthlyInterestRate = yearlyInterestRate / Percent / Month_In_Year;

        System.out.print("Tenur: ");
        byte years = scanner.nextByte();
        int numberOfPayment = years * Month_In_Year;

        double mortgage = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayment))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayment) -1 );

        String mortgageFormatted = NumberFormat.getNumberInstance().format(mortgage);
        System.out.println(mortgageFormatted);









    }

}
