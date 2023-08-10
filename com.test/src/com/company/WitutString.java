package com.company;

import java.util.Scanner;

public class WitutString {


    public void zaza(){

        Scanner name = new Scanner(System.in);

        System.out.print("Please enter your name: ");

        String myName = name.nextLine().toLowerCase();

        switch (myName){

            case "sabbir":
                System.out.println("Correct");
                break;

            case "ahamed":
                System.out.println("It's your last name.");

                break;

            default:

                System.out.println("I am not sure.");

        }




    }
}
