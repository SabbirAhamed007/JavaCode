package com.company;

import java.util.Scanner;

public class MyName {

    public void name(){


        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");

        String nameEnter = input.nextLine().toLowerCase();

        switch (nameEnter){

            case "sabbir":
                System.out.println("You are right. Sabbir is your first name.");
                break;



            case "ahamed":

                System.out.println("Ahamed is your last name.");

                break;

            case "":
                System.out.println("I dont know.");
        }

    }
}
