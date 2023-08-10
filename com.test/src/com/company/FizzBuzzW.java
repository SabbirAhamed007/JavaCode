package com.company;

import java.util.Scanner;

public class FizzBuzzW {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter number: ");

        int myNumber = input.nextInt();

        if (myNumber % 5 == 0 && myNumber % 3 == 0){

            System.out.println("Fizz Buzz");

        }

        else if (myNumber % 5 == 0 ){


            System.out.println("Fizz");
        }

        else if (myNumber % 3 == 0){

            System.out.println("Buzz");
        }

        else {

            System.out.println("This is not mod number by 5 or 3. Please enter any number mod zero by 5 or 3.");
        }



    }
}
