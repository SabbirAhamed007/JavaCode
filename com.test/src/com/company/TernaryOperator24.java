package com.company;

import java.util.Scanner;

public class TernaryOperator24 {

    public static void main(String[] args){


        Scanner income = new Scanner(System.in);

        System.out.print("Please enter your yearly income: ");

        float myIncome = income.nextFloat();

        String className = myIncome > 100_000 ? "First Class" : "Economy Class";

        System.out.println(className);



    }
}
