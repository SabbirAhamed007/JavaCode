package com.company;

public class Test338 {

    public static void main(String[] args){


        int x = 1;
        int y = 1;
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x <= y);
        System.out.println(x >= y);


        int temp = 12;
        boolean isWarm = temp > 20 && temp< 40;
        System.out.println(isWarm);


        int cost = 100;

        boolean isExpensive = cost > 100 || cost == 100;


        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCreminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCreminalRecord;

    }
}
