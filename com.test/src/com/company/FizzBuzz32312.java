package com.company;

import java.util.Scanner;

public class FizzBuzz32312 {

    public static void main(String[] args){

        Scanner number = new Scanner(System.in);

        System.out.println("Please enter any number!!!");

        System.out.print("Please enter your number: ");

        int myNumber = number.nextInt();

        if (myNumber % 5 == 0 && myNumber % 3 == 0)
            System.out.println("FizzBuzz !!!");

        else if (myNumber % 3 == 0)
            System.out.println("Buzz !!!");

        else if (myNumber % 5 == 0)

            System.out.println("Fizz !!!");

        else
            System.out.println(number);

    }
}
