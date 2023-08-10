package com.company;

import java.util.Scanner;

public class ControlFlow21 {

    public static void main(String[] args){

        int x = 2;
        int y = 2;
        System.out.println(x == y);
        System.out.println( x != y);
        System.out.println( x >= y);
        System.out.println( x <= y);

        int temp = 22;
        boolean isWarm = (temp > 20 && temp < 30);
        System.out.println(isWarm);


        Scanner inputTemp = new Scanner(System.in);

        System.out.print("Please enter current temparature: ");

        Float currentTemp = inputTemp.nextFloat();


        boolean isNice = (currentTemp > 20 && currentTemp < 30);
        System.out.println(isNice);


//        boolean hasHighIncome = true;
//        boolean hasGoodCredit = true;
//        boolean hasCreminalRecord = true;
//
//        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCreminalRecord;


        Scanner myInput = new Scanner(System.in);

        System.out.print("Please enter your yearly income: ");

        double income = myInput.nextDouble();

        boolean hasHighIncome = income >= 100_000;

        System.out.print("Please enter your credit score: ");

        double credit = myInput.nextDouble();

        boolean hasGoodCredit = credit >= 7.5;

        System.out.print("Do you have any creminal record: ");

        String creminalRecord = myInput.nextLine().toLowerCase();

        if (creminalRecord.equals("yes")){

            System.out.println("Good to go.");


        }












    }
}
