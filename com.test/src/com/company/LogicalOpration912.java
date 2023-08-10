package com.company;

import java.util.Scanner;

public class LogicalOpration912 {

    public static void main(String[] args){

        boolean hasGoodCredit = true;
        boolean hasGoodIncome = true;
        boolean hasCrimnalRecord = false;

        boolean isEligibleLoan = (hasGoodCredit || hasGoodIncome ) && !hasCrimnalRecord;


        Scanner currentTemp = new Scanner(System.in);
        System.out.print("Please enter current temperature: ");

        int temperature = currentTemp.nextInt();

        if (temperature > 20 && temperature < 30){
            System.out.println("Today is nice outside.");
        } else {

            System.out.println("It is hot outside.");
        }





    }
}
