package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcptionHan2 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);


        try{



            System.out.print("Please enter first number: ");

            int num1 = input.nextInt();

            System.out.print("Please enter second number: ");

            int num2 = input.nextInt();

            int result = num1 / num2;

            System.out.println(result);
        }

        catch (ArithmeticException e){

            System.out.println("Please enter a number.");

        }

        catch (InputMismatchException e){

            System.out.println("Please enter a number. Not a letter.");

        }
        finally {
            input.close();
        }

    }
}
