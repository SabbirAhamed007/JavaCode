package com.company;

import java.util.Scanner;

public class SwitchJJ {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String myNam = input.nextLine().toLowerCase();

        switch (myNam){

            case "sabbir":

                System.out.println("First Name.");
                break;

            case "ahamed":
                System.out.println("Last Name.");
                break;

            case "":

                System.out.println("I am not sure.");
                break;
            default:

                System.out.println("What is this.");
        }
    }
}
