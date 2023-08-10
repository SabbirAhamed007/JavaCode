package com.company;

import java.util.Scanner;

public class Switch74 {

    public static void main(String[] args){


        Scanner color = new Scanner(System.in);

        System.out.print("Please enter your car color: ");

        String myCarColor = color.nextLine().toLowerCase();


        switch (myCarColor){


            case "black":

                System.out.println("Black is common color.");

                break;

            case "white":

                System.out.println("White is an official color.");

                break;

            case "red":

                System.out.println("Red is nice, Girls like it.");

                break;

            default:

                System.out.println("I am not sure.");

        }
    }
}
