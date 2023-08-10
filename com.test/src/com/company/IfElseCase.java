package com.company;

import java.util.Scanner;

public class IfElseCase {

    public static void main(String[] args){


        Scanner inpur = new Scanner(System.in);

        System.out.print("Please enter current temparature: ");

        int myInput = inpur.nextInt();

        if (myInput == 20 && myInput < 25){

            System.out.println("Nice Weather outside.");
        }

        else if (myInput < 20 && myInput > 15){

            System.out.println("It's little chill outside.");
        }

        else if (myInput <=15){

            System.out.println("It's cold outside , please take your jacket");
        }

        else {

            System.out.println("It's hot outside , drink planty of water.");
        }
    }
}
