package com.company;

import java.util.Scanner;

public class ABCtest {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your color: ");

        String myInput = input.nextLine().toLowerCase();

        switch (myInput){


            case "red":

                System.out.println("Nice color.Girls like it.");

                break;

            case "blue":

                System.out.println("Blue is a nice color. Man likes it.");

                break;

            case "black":

                System.out.println("Very common color.");

                break;

            case "White":

                System.out.println("Official color.");

                break;

            default:

                System.out.println("I am not sure.");
        }

    }
}
