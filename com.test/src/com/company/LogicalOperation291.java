package com.company;

import java.util.Scanner;

public class LogicalOperation291 {

    public static void main(String[] args){

        Scanner creditScore = new Scanner(System.in);
        System.out.print("Please enter your credit score: ");
        int creScore = creditScore.nextInt();

        if (creScore >= 800) {

            System.out.println("Excelent Credit score. Eligible for the loan.");
        }

        if (creScore >= 750 && creScore <= 799){
            System.out.println("Good Credit score. Eligible for the loan.");
        }

        if (creScore >= 700 && creScore <= 749){
            System.out.println("Average credit score. Please check income level.");
        }





    }
}
