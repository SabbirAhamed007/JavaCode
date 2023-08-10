package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HndlException {

    public static void main(String[] args){


        try{


            Scanner input = new Scanner(System.in);

            System.out.print("Please enter your first number: ");

            int myFirstNum = input.nextInt();

            System.out.print("Please enter your second number: ");

            int mySecondNum = input.nextInt();

            int result = myFirstNum / mySecondNum;

            System.out.println(result);
        }

        catch (ArithmeticException e){


            System.out.println("Please do not use 0.");

        }

        catch (InputMismatchException e){

            System.out.println("Please enter any number.");

        }








    }
}
