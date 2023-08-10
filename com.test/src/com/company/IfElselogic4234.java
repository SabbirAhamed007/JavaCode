package com.company;

import java.util.Scanner;

public class IfElselogic4234 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter any number: ");

        int myInput = input.nextInt();

        if (myInput % 5 == 0 && myInput % 3 == 0){

            System.out.println("FizzBuzz");
        }


        else if(myInput % 5 == 0 ){

            System.out.println("Fizz");
        }


        else if (myInput % 3 == 0) {

            System.out.println("Buzz");

        }

        else

            System.out.println("Try again!!!");


    }
}
