package com.company;

import java.util.Scanner;

public class simplyfyCode54 {

    public static void main(String[] args){

        int income = 120_000;

        boolean hasHighIncome;

        if (income > 100000)
            hasHighIncome = true;
        else
            hasHighIncome = false;


        Scanner urIncome = new Scanner(System.in);

        System.out.print("Please enter your yearly income: ");

        int myIncome = urIncome.nextInt();

        boolean hasGreatIncome = (myIncome >= 120_000);










    }
}
