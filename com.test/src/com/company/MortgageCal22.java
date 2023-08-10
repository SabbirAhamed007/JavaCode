package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCal22 {

    public static void main(String[] args){

//        int principlal = 1000000;
//        float intrestRate = 3.92F;
//        int perid = 25;

        final byte Months_In_Year = 12;
        final byte Percent = 100;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter principal loan amount: ");

        float totalLoanAmount = input.nextFloat();

        System.out.print("Please enter annual interest rate: ");
        float monthlyInterestRate = input.nextFloat() / Percent / Months_In_Year;

        System.out.print("Please enter loan tenor: ");

        float numberOfMonths = input.nextFloat() * Months_In_Year;

        Double mortgage = totalLoanAmount  * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths))/ (Math.pow(1 + monthlyInterestRate, numberOfMonths) -1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Monthly Pay: " + mortgageFormatted);











    }


}
