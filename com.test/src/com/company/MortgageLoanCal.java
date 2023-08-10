package com.company;

import java.util.Scanner;

public class MortgageLoanCal {

    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your loan amount: ");

        int principleAmount = input.nextInt();

        System.out.print("Please enter number of year for loan: ");

        int numberYear = input.nextInt();

        int numberMonths = numberYear * 12;

        byte percent = 100;

        System.out.print("Please enter the interest rate yearly: ");

        float intRateYearly = input.nextFloat();

        float intRateMonthly = intRateYearly / percent/ numberMonths;



    }
}
