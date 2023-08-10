package com.company;

import java.util.Scanner;

public class LogicalCon333 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");

        String myName = input.nextLine().toLowerCase();


        if (myName.equals("sabbir")){

            System.out.println("This is your first name.");
        }

        else if (myName.equals("ahamed")){

            System.out.println("This is your last name please enter first name.");

            System.out.print("Please enter your first name: ");


        }


        else {

            System.out.println("Please retry.");
        }
    }
}
