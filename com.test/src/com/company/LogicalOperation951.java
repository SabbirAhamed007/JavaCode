package com.company;

public class LogicalOperation951 {

    public static void main(String[] args){

        int temp = 23;
        boolean isWorm = temp >= 20 && temp <=30;
        System.out.println(isWorm);

        String sky = "cloudy";

        boolean isNiceSky = sky == "cloudy";

        System.out.println(isNiceSky);


        int tem = 22;

        boolean is21 = tem > 20 && tem < 22;
        System.out.println(is21);

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;

        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println(isEligible);






    }
}
