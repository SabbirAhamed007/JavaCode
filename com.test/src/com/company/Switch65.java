package com.company;

import java.util.Scanner;

public class Switch65 {

    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your car color: ");

        String carColor = input.nextLine().toLowerCase();

        switch (carColor){

            case "red":

                System.out.println("Red is a nice color. Girls like this color.");

                break;

            case "black":

                System.out.println("Balck is a common color.");

                break;

            default:

                System.out.println("I am not sure.");

        }
    }
}
