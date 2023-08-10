package com.company;

import java.util.Scanner;

public class FizzBuzzDecent {

    public static void main(String[] args){

        Scanner inout = new Scanner(System.in);

        System.out.print("Please enter any number: ");

        int myInput = inout.nextInt();

        if (myInput % 5 == 0){

            if (myInput % 3 == 0)

                System.out.println("FizzBuzz");

            else

                System.out.println("Fizz");
        }

        else if (myInput % 3 ==0)

            System.out.println("Buzz");

        else
            System.out.println(myInput);
    }
}
