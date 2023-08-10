package com.company;

import java.util.Scanner;

public class LogicalOperators778921 {

    public static void main(String[] args){

        int temparature = 20;


        boolean isWorm = temparature > 20 && temparature<30;

        System.out.println(isWorm);


        boolean hashighIncome = true;

        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;

        boolean isEligible = (hashighIncome || hasGoodCredit) && !hasCriminalRecord;

        System.out.println(isEligible);


        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your yearly income: ");

        float myIncome = input.nextFloat();


        System.out.print("Please enter your credit score: ");

        float myCreditScore = input.nextFloat();

        System.out.print("Do you have any creminal record: ");

        String CriminalRecord = input.nextLine().toLowerCase();


        if ((myIncome >= 100000 && myCreditScore < 7.5) || CriminalRecord.equals("no") ){

            System.out.println("Your are eligible for the loan.");
        }




    }
}
