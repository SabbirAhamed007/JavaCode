package com.company;

import java.util.Scanner;

public class IfElseT {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your number: ");

        int myNUmber = input.nextInt();


        if (myNUmber % 5 == 0 && myNUmber % 3 == 0){

            System.out.println("FizzBuzz");
        }

        else if (myNUmber % 5 == 0){


            System.out.println("Fizz");
        }

        else if (myNUmber % 3 == 0){

            System.out.println("Buzz");
        }

        else {

            System.out.print("Please enter your number: ");
            input.nextInt();

        }
    }
}
