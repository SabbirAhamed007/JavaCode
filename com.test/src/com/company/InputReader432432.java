package com.company;

import java.util.Scanner;

public class InputReader432432 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the student name: ");
        String stNam = scanner.nextLine();
        System.out.println("Students are: " + stNam);

        System.out.print("Please enter the tenur (year): ");
        byte tenur = scanner.nextByte();
        System.out.println("Total loan year: " + tenur);

        System.out.print("Please enter the tenur (year): ");
        byte NumOfPayments = scanner.nextByte();
        System.out.println("Number of payments: " + tenur * 12);

        System.out.print("Please enter the annual interest rate: ");
        float interestMonthly = scanner.nextFloat();
        System.out.println("Monthly interest rate is: " + interestMonthly / 100 / 12);







    }
}
