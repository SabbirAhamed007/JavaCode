package com.company;

import java.util.Scanner;

public class SwitchMethods4444 {

    public static void main(String[] args){


        Scanner carColor = new Scanner(System.in);

        System.out.print("Please enter your car color: ");

        String myCarColor = carColor.nextLine().toLowerCase();


        switch (myCarColor) {


            case "red":

                System.out.println("Red is a nice color.");
                break;

            case "white":
                System.out.println("White is an official color.");
                break;

            case "black":

                System.out.println("Black is common color.");
                break;

            default:

                System.out.println("I am not sure.");
        }
    }
}
