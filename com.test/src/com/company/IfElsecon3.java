package com.company;

import java.util.Scanner;

public class IfElsecon3 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");

        String myName = input.nextLine().toLowerCase();


        if (myName.equals("sabbir")){

            System.out.println("This is my first name.");
        }

        else if (myName.equals("ahamed")){


            System.out.println("This is your last name.");
        }

        else

            System.out.println("Please try again.");

    }
}
