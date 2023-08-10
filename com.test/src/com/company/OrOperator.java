package com.company;

public class OrOperator {
    public static void main(String[] args){


        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean noCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !noCriminalRecord;



    }
}
