package com.company;

public class LogicalOPerator3903 {

    public static void main(String[] args){


        int temparature = 22;

        boolean isWarm = temparature > 20 && temparature < 30;
        System.out.println(isWarm);


        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;

        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
    }
}
