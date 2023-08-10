package com.company;

import java.util.Scanner;

public class EqualOprator {

    public static void main(String[] args){

        int x = 3;
        int y = 3;
        System.out.println(x == y);
        System.out.println(x != y);


        int temp = 20;

        boolean isWorm = temp > 20 && temp < 30;

        System.out.println(isWorm);

        boolean hasGoodIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = true;

        boolean isEligible = (hasGoodCredit == true || hasGoodIncome == true) && !hasCriminalRecord  ;
        System.out.println("He will get a loan.");


        boolean redCar = true;
        boolean blackCar = true;
        boolean whiteCar = true;

        boolean isSalable = (redCar == true && blackCar == true) && ! whiteCar;
        System.out.println("Is it saleble...");



    }
}
