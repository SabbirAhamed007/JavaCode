package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCat1 {

    public static void main(String[] args){


       try {
           Scanner input = new Scanner(System.in);

           System.out.print("Please enter your 1st number: ");

           int firstNum = input.nextInt();

           System.out.print("Please enter your 2nd number: ");

           int secondNum = input.nextInt();

           int result = firstNum / secondNum;

           System.out.println(result);
       }
       catch (ArithmeticException e){


           System.out.println("Please do not enter 0, enter a number.");
       }

       catch (InputMismatchException e){


           System.out.println("Please do not enter any character. Enter a number.");
       }




    }
}
