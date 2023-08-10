package com.company;

import java.util.Scanner;

public class FizzBuzz00 {

    public static void main(String[] args){

        Scanner choosenNumber = new Scanner(System.in);

        System.out.print("Please enter your number: ");
        int myNumber = choosenNumber.nextInt();

        if (myNumber % 5 == 0 && myNumber % 3 ==0)
            System.out.println("FizzBuzz");

        else if (myNumber % 5 == 0)

            System.out.println("Fizz");

        else if (myNumber % 3 == 0)
            System.out.println("Buzz");

        else
            System.out.println(myNumber);

    }
}
