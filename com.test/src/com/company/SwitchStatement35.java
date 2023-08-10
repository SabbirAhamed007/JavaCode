package com.company;

import java.util.Scanner;

public class SwitchStatement35 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your color: ");

        String myInput = input.nextLine().toLowerCase();

        switch (myInput){

            case "red":

                System.out.println("Red is a nice color. Girls like it.");

                break;

            case "black":

                System.out.println("Black is a common color.");

                break;

            case "blue":

                System.out.println("Blue is nice color. Man's like it.");

                break;

            default:

                System.out.println("Not sure.");



        }



    }
}
