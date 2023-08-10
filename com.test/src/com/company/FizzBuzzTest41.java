package com.company;

import java.util.Scanner;

public class FizzBuzzTest41 {

    public static void main(String[] args){


        Scanner number = new Scanner(System.in);

        System.out.print("Please enter any number to try your luck: ");

        int myNumber = number.nextInt();


        if (myNumber % 5 == 0 && myNumber % 3 == 3)

            System.out.println("Buzz !!!");

        else if (myNumber % 5 == 0)

            System.out.println("Fizz !!!");

        else if (myNumber % 3 == 0)

            System.out.println("Fizz !!!");

        else

            System.out.println("You have two more try.");



    }
}
