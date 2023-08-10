package com.company;

import java.util.Scanner;

public class Switch43 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");

        String name = input.nextLine().toLowerCase();

        switch (name){
            case "sabbir":

                System.out.println("It's your first name.");
                break;

            case "ahamed":
                System.out.println("It's your last name.");
                break;

            default:

                System.out.println("I am not sure.");
        }

    }
}
