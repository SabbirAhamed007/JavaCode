package com.company;

import java.util.Scanner;

public class SwitchStatement53454 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your color: ");

        String myInput = input.nextLine().toLowerCase();

        switch (myInput){


            case "red":

                System.out.println("Red , nice.");

                break;


            case "black":

                System.out.println("Black, Common.");

                break;

            case "white":

                System.out.println("White, Common.");

                break;

            default:

                System.out.println("I dont know.");
                break;
        }

    }
}
