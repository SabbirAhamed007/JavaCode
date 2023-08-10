package com.company;

import java.util.Scanner;

public class FizzBuzz22 {

    public static void main(String[] args){

        Scanner num = new Scanner(System.in);

        System.out.print("Please enter your number: ");

        float myNum = num.nextFloat();

        if (myNum % 5 ==0 && myNum % 3 ==0){

            System.out.println("FizzBuzz");
        }

        else if (myNum % 5 == 0){

            System.out.println("Fizz");
        }

        else if (myNum % 3 ==0){

            System.out.println("Buzz");
        }

        else

            System.out.println("I am not sure.");



    }
}
