package com.company;

import java.util.Scanner;

public class IfElseTest {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your number: ");

        int myInout = input.nextInt();

        try {

            if (myInout >= 20 && myInout <= 30){

                System.out.println("Nice weather outside.");
            }

            else if (myInout > 30){

                System.out.println("It's hot.");
            }

            else if (myInout < 20 ){

                System.out.println("It's cold.");
            }

        }

        catch (Exception e){


            System.out.println("Enter any integer number.");
        }



    }
}
