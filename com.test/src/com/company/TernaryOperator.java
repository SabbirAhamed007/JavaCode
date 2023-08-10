package com.company;

import java.util.Scanner;

public class TernaryOperator {

    public static void main(String[] args){

        Scanner income = new Scanner(System.in);

        System.out.print("Please enter your income per year: ");

        int yearlyIncome = income.nextInt();

        String className = yearlyIncome > 100_000 ? "First Class" : "Economy Class";




    }
}
