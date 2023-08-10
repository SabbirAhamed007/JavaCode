package com.company;

import java.util.Scanner;

public class TenaryOperator44 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your income: ");

        float myInput = input.nextFloat();

        String className = myInput > 100_000 ? "First Class" : "Economy Class";

        System.out.println(className);


    }
}
