package com.company;

import java.util.Scanner;

public class Switch32 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your car color: ");

        String myCarColor = input.nextLine().toLowerCase();

        switch (myCarColor){


            case "red":


                System.out.println("Red is a nice color.");
                break;

            case "black":

                System.out.println("Black is common car color.");

                break;

            case "white":
                System.out.println("White is an official color.");

                break;


            default:

                System.out.println("I dont know.");
        }

    }
}
