package com.company;

import java.util.Scanner;

public class FizzBuzz987 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your number: ");

        int myInput = input.nextInt();

        if (myInput % 5 == 0 && myInput % 3 ==0){

            System.out.println("FizzBuzz");
        }

        else if (myInput % 5 == 0){

            System.out.println("Fizz");
        }

        else if (myInput % 3 == 0){

            System.out.println("Buzz");
        }

        else

            System.out.println("Try again.");
    }
}
