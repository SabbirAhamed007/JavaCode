package com.company;

import java.util.Scanner;

public class FizzBuzz63 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your number: ");

        int myNumber = input.nextInt();

        if (myNumber % 5 == 0 && myNumber % 3 ==0){

            System.out.println("FizzBuzz");
        }

        else if (myNumber % 5 == 0){

            System.out.println("Fizz");
        }

        else if (myNumber % 3 == 0){

            System.out.println("Buzz");
        }

        else

            System.out.print("Please enter your number again: ");

        input.nextInt();

        myNumber = input.nextInt();

        if (myNumber % 5 == 0 && myNumber % 3 ==0){

            System.out.println("FizzBuzz");
        }

        else if (myNumber % 5 == 0){

            System.out.println("Fizz");
        }

        else if (myNumber % 3 == 0){

            System.out.println("Buzz");
        }

        else

            System.out.print("Please enter your number again: ");




    }
}
