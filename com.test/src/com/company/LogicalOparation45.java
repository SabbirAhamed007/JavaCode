package com.company;

public class LogicalOparation45 {

    public static void main(String[] args){

        boolean highIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;

        boolean isEligible = (highIncome || hasGoodCredit) && !hasCriminalRecord;




    }
}
