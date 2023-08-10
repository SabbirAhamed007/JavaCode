package com.company;

import java.util.Scanner;

public class WhileLops494 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String myName = "";

        while(true){

            System.out.print("Please enter your name: ");

            myName = input.nextLine().toUpperCase();


        if (myName.equals("sabbir"))

            System.out.println("Correct");


        else if (myName.equals("ahamed"))
            System.out.println("It's your last name.");

        else
            System.out.println("I am not sure.");


        }




    }
}
