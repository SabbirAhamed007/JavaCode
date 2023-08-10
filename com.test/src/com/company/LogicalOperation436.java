package com.company;

import java.util.Scanner;

public class LogicalOperation436 {

    public static void main(String[] args){

        int temp = 22;

        boolean isworm = temp >= 20 && temp <=30;

        System.out.println(isworm);


        Scanner temparature = new Scanner(System.in);

        System.out.print("Please enter today's temparature: ");

        int todayTemp = temparature.nextInt();

        boolean isNiceTemp = todayTemp >= 20 && todayTemp <= 30;

        isNiceTemp = true;
        System.out.println("Today is nice");

        System.out.println(isNiceTemp);


        boolean highIncome = true;
        boolean highCreditScore = true;
        boolean hasCreminalRecord = false;

        boolean isEligible = (highIncome || highCreditScore) && !hasCreminalRecord;






    }
}
