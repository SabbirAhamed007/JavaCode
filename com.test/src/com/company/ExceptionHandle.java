package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandle {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        try{



            System.out.print("Please enter a whole number to divide: ");

            int x = input.nextInt();

            System.out.print("Please enter a whole number to divide: ");

            int y = input.nextInt();

            int z = x / y ;

            System.out.println("Result: " + z);


        }

        catch (ArithmeticException e){


            System.out.println("Please do not divide by zero");

        }

        catch (InputMismatchException e){

            System.out.println("Please enter a number !!!");
        }

        catch (Exception e){

            System.out.println("Please call help desk.");
        }

        finally {
            input.close();
        }



    }
}
