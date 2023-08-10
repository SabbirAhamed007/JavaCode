package com.company;

import java.util.Scanner;

public class booleantest32 {

    public static void main(String[] args){


        int income = 120_000;
        boolean hasHighIncome = (income > 100_000);


        Scanner yearlyIncome = new Scanner(System.in);
        System.out.print("Please enter your yearly income: ");
        int myIncome = yearlyIncome.nextInt();

        String className = myIncome >100_000 ? "First Class" : "Economy Class";






    }
}
