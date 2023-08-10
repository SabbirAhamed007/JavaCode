package com.company;

import java.util.Scanner;

public class TenaryOprator33 {

    public static void main(String[] args){


        int income = 120000;
        String className = income > 100000 ? "First Class" : "Economy Class";

        System.out.println(className);

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your yearly income: ");

        float myIncome = input.nextFloat();

        String className2 = myIncome > 100000 ? "First Class" : "Economy Class";
        System.out.println(className2);





    }
}
