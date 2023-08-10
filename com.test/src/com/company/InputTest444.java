package com.company;

import java.util.Scanner;

public class InputTest444 {


    public static void main(String[] args){

        Scanner color = new Scanner(System.in);

        System.out.print("Please enter your color: ");

        String myColor = color.nextLine().toLowerCase();

        switch (myColor){


            case "red":

                System.out.println("Red is a common color. girls like it.");
                break;

            case "black":

                System.out.println("Black is a common color.");
                break;

            case "white":

                System.out.println("White is a official color.");

                break;

            default:

                System.out.println("I am not sure.");
        }


    }

}
