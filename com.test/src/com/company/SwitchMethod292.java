package com.company;

import java.util.Scanner;

public class SwitchMethod292 {

    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");

        String myName = "";

        myName = input.nextLine().toLowerCase();



        switch (myName){

            case "sabbir":



                System.out.println("Correct. This is your first name.");

                break;

            case "ahamed":
                System.out.println("This is your last name.");

                break;

            default:

                System.out.print("Please enter your name: ");






        }

    }
}
