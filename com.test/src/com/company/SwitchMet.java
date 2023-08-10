package com.company;

import java.util.Scanner;

public class SwitchMet {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your color: ");

        String myColor = input.nextLine();

        switch (myColor){


            case "black":

                System.out.println("Black is a common color.");

                break;

            case "white":

                System.out.println("White is an official color.");

                break;

            case "red":

                System.out.println("Woman like it.");

                break;

            default:

                System.out.println("Please try again.");
        }
    }
}
