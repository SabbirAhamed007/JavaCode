package com.company;

import java.util.Scanner;

public class MathTTY {

    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your number: ");

        int myNum = input.nextInt();


        if (myNum % 5 == 0 && myNum % 3 == 0 ){

            System.out.println("FizzBuzz");
        }

        else if (myNum % 5 == 0){

            System.out.println("Fizz");
        }

        else if (myNum % 3 == 0){


            System.out.println("Buzz");
        }

        else

            System.out.println("Try your luck again.");

    }
}
