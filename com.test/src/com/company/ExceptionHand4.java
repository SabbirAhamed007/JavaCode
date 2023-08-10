package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHand4 {

    public static void main(String[] args){

        try {
            Scanner input = new Scanner(System.in);


            System.out.print("Please enter your first number: ");

            int firstNum = input.nextInt();

            System.out.print("Please enter your second number: ");

            int secondNum = input.nextInt();

            int result = firstNum / secondNum;

            System.out.println(result);
        }

        catch (ArithmeticException e){

            System.out.println("Please enter a number without 0");

        }

        catch (InputMismatchException e){

            System.out.println("Please enter a number not latter.");

        }

    }
}
