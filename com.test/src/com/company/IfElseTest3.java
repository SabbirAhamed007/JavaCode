package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IfElseTest3 {

    public static void main(String[] args){

        try {
            Scanner input = new Scanner(System.in);

            System.out.print("Please enter your number: ");

            int myNum = input.nextInt();

            if (myNum % 5 == 0 && myNum % 3 == 0){

                System.out.println("FizzBuzz");
            }

            else if (myNum % 5 ==0){

                System.out.println("Fizz");
            }

            else if (myNum % 3 == 0){

                System.out.println("Buzz");
            }

            else {

                System.out.println("Please retry.");
            }
        }

        catch (InputMismatchException e){

            System.out.println("Please enter any number, not letter.");
        }
    }
}
