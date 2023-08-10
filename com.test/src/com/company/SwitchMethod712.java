package com.company;

import java.util.Scanner;

public class SwitchMethod712 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the color you like: ");

        String myColor = input.nextLine().toLowerCase();

        switch (myColor){


            case "red":

                System.out.println("Red is nice color. Woman like it.");

                break;

            case "black":

                System.out.println("Black is common color.");

                break;

            case "white":

                System.out.println("White is official color.");

                break;

            default:

                System.out.println("I am not sure.");
        }
    }

}
