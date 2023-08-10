package com.company;

import java.util.Scanner;

public class HighLAnder {

    public static void main(String[] args){

        Scanner inut = new Scanner(System.in);

        System.out.print("Please enter your name: ");

        String myName = inut.nextLine().toLowerCase();

        switch (myName){

            case "sabbir":

                System.out.println("Correct");

                break;

            case "ahamed":

                System.out.println("It's a last name.");

                break;

            default:

                System.out.print("Please enter your name again: ");

                myName = inut.nextLine().toLowerCase();

                if (myName.equals("sabbir")){
                    System.out.println("Correct");

                }

                else if (myName.equals("ahamed")){

                    System.out.println("It's a last name.");
                }

                else {

                    System.out.println("I am not sure.");
                }

        }
    }
}
