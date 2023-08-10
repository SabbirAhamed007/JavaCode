package com.company;

import java.util.Scanner;

public class Switch54 {

    public static void main(String[] args){

        Scanner color = new Scanner(System.in);

        System.out.print("Please enter your car color: ");

        String carColor = color.nextLine().toLowerCase();

        switch (carColor){

            case "red":

                System.out.println("Red is a nice color.");

                break;

            case "white":

                System.out.println("White is a official color.");

                break;

            case "black":

                System.out.println("Black is a common color.");

                break;


            default:

                System.out.println("I am not sure.");

        }
    }
}
