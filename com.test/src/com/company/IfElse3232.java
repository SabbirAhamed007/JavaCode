package com.company;

import java.util.Scanner;

public class IfElse3232 {

    public static void main(String[] args){

        Scanner value = new Scanner(System.in);

        System.out.print("Please try your luck and enter any number: ");

        int yourNumber = value.nextInt();

        if (yourNumber % 5 == 0 && yourNumber % 3 == 0){

            System.out.println("Buzz !!!");

        }

        else if (yourNumber % 5 == 0){

            System.out.println("Fizz !!!");
        }

        else if (yourNumber % 3 == 0){

            System.out.println("Fizz !!!");
        }

        else {

            System.out.println("Better luck next time !!!");
        }






    }
}
