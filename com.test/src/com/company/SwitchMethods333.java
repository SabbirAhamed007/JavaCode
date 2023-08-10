package com.company;

import java.util.Scanner;

public class SwitchMethods333 {


    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your car color: ");

        String color = input.nextLine().toLowerCase();

        switch (color){

            case "red":

                System.out.print("Nice Color.");
                break;


            case "blue":
                System.out.println("Manly color.");
                break;

            case "black":
                System.out.println("Common color.");
                break;
            default:

                System.out.println("I am not sure.");


        }

    }
}
