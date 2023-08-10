package com.company;

import java.util.Scanner;

public class Switch56 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");

        String myName = input.nextLine().toLowerCase();


        switch (myName){

            case "sabbir":
                System.out.println("Nope.");
                break;

            case "ahamed":
                System.out.println("Not right.");
                break;

            case "jack":

                System.out.println("Correct");
                break;

            default:

                System.out.println("It's not I guess.");
        }
    }
}
