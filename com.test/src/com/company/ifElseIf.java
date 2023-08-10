package com.company;

import java.util.Scanner;

public class ifElseIf {

    public static void main(String[] args){

        Scanner number = new Scanner(System.in);

        System.out.print("Please enter the number you want to test: ");

        int myNumber = number.nextInt();

        if (myNumber % 5 == 0 && myNumber % 3 == 0 )
            System.out.println("Buzz !!!");

        else if (myNumber % 5 == 0)
            System.out.println("Sizz !!!");

        else if (myNumber % 3 == 0 )
            System.out.println("Sizz !!!");

        else

            System.out.println("Try again.");


    }
}
