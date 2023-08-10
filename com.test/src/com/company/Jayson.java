package com.company;

import java.util.Scanner;

public class Jayson {

    public static void main(String[] args){


        Scanner number = new Scanner(System.in);

        System.out.print("Please enter your number: ");

        int myNumber = number.nextInt();

        switch (myNumber){

            case 1:

                if(myNumber % 3 ==0 && myNumber % 5 ==0){

                    System.out.println("FizzBuzz");
                    break;
                }

            case 2:

                if (myNumber % 5 ==0){

                    System.out.println("Fizz");
                    break;
                }
            case 3:

                if (myNumber % 3 == 0){

                    System.out.println("Buzz");
                    break;
                }


            default:

                System.out.println("I am not sure. Try again !!!");
        }


    }
}
