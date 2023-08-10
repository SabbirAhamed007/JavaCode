package com.company;

import java.util.Scanner;

public class IfCondition {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter temp: ");

        float myInput = input.nextFloat();

        try {
            if (myInput > 20 && myInput <30){

                System.out.println("It's a nice weather.");
            }

            else if (myInput <= 20){

                System.out.println("It's a cold day. Take your jacket.");
            }

            else if (myInput >= 30){

                System.out.println("It's a hot day. Drink water.");
            }

            else {

                System.out.println("I am not sure.");
            }
        }

        catch (Exception e){

            System.out.println("Please enter NUmber only.");
        }


    }
}
