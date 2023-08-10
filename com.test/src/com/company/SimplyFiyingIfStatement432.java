package com.company;

public class SimplyFiyingIfStatement432 {

    public static void main(String[] args){

        int income = 120_000;

        //boolean hasHighIncome = (income > 100_000);

        String className = income > 100_000? "First Class" : "Economy Class";

        System.out.println(className);

    }
}
