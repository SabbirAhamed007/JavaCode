package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandl {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        try{



            System.out.print("Please enter first number: ");

            int numberOne = input.nextInt();

            System.out.print("Please enter second number: ");

            int numberTwo = input.nextInt();

            int result = numberOne / numberTwo;

            System.out.println(result);

        }

        catch (ArithmeticException e){


            System.out.println("Please do not enter 0");


        }

        catch (InputMismatchException e){

            System.out.println("Please enter any number.");

        }

        finally {

            input.close();
        }


    }
}
