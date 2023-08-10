package com.company;

import java.util.Scanner;

public class controlFlow5 {

    public static void main(String[] args){

        int x = 7;
        int y = 5;

        System.out.println(x == y);

        System.out.println(x != y);

        System.out.println(x <= y);

        System.out.println(x >= y);


        int temp = 22;

        boolean isWorm = temp > 20 && temp < 30;
        System.out.println(isWorm);


        boolean hasHighIncome = false;

        boolean hasGoodCredit = true;

        boolean hasNoCreminalRecord = false;

        boolean hasEligible = (hasHighIncome || hasGoodCredit) && !hasNoCreminalRecord;

        System.out.println(hasEligible);


        Scanner input = new Scanner(System.in);

        System.out.print("Please enter temp now: ");

        int tempNow = input.nextInt();


        if (tempNow > 20 && temp < 30){

            System.out.println("Nice weather today.");
        }

        else if (tempNow == 20){

            System.out.println("Nice weather but little chill.");
        }

        else if (tempNow == 30){

            System.out.println("It's nice but little hot.");
        }

        else if (tempNow < 20){

            System.out.println("It's cold, please take jacket.");
        }

        else if (tempNow > 30){

            System.out.println("It's hot today. Drink water.");
        }



    }
}
