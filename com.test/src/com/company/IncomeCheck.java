package com.company;

import java.util.Scanner;

public class IncomeCheck {

    public static void main(String[] args){

        Scanner inout = new Scanner(System.in);

        System.out.print("Please enter your yearly income: ");

        float myIncome = inout.nextFloat();

        if (myIncome > 10000){

            System.out.println("Platinum class.");
        }

        else if (myIncome >= 80000 && myIncome <= 10000){

            System.out.println("Gold Class.");
        }

        else{

            System.out.println("Economy Class.");
        }


        int incomeY = 120_000;
        boolean hasHighIncome = (incomeY > 100_000);

    }
}
