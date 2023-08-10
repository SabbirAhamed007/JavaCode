package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalcu5343 {

    public static void main(String[] args){


        //Principal : 1000000
        //Annual Interest Rate : 3.5
        //Period : 22

        // Mortgage load calculation process  M = P (r(1+r)n) / (1 + r)n -1;

        final byte Month_In_Year = 12;
        final byte Percent = 100;
        int principal = 0;
        float yearlyInterestRate = 0;
        float monthlyInterestRate = 0;

        int numberOfPayment = 0;



        int TotalMonths = 22 * 12;

        Scanner scanner = new Scanner(System.in);

        while (true){

            System.out.print("Please enter your principal amount: ");

            principal = scanner.nextInt();

            if (principal >= 1000 && principal <=1_000_000)
                break;

            System.out.println("Please enter value between 1000 to 1_000_000");

        }

        while (true){

            System.out.print("Annual interest rate: ");
            yearlyInterestRate = scanner.nextFloat();

            if(yearlyInterestRate >= 1 && yearlyInterestRate <= 30) {
                monthlyInterestRate = yearlyInterestRate / Percent / Month_In_Year;
                break;

            }

            System.out.println("Please enter annual interest rate between 1 to 30.");




        }


        while (true){

            System.out.print("Please enter tenur: ");

            byte years = scanner.nextByte();

            if (years > 5 && years <= 30) {
                numberOfPayment = years * Month_In_Year;
                break;
            }

            System.out.println("Please enter years 5 to 30");



        }


        double mortgage = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayment))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayment) -1 );

        String mortgageFormatted = NumberFormat.getNumberInstance().format(mortgage);
        System.out.println(mortgageFormatted);


    }
}
