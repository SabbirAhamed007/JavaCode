package com.company;

import java.util.Scanner;

public class SwitchStatement2992 {

    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your car color: ");

        String myCarColor = input.nextLine().toLowerCase();

        switch (myCarColor){

            case "red":

                System.out.println("Red is a nice color. Looks beautiful.");
                break;

            case "black":
                System.out.println("Black is common color in USA.");
                break;

            case "white":
                System.out.println("White is an offcial color.");
                break;

            case "blue":
                System.out.println("Bule is a nice color. Mens like it.");
                break;

            default:

                System.out.println("I am not sure. Talk with customer service. ");
        }
    }
}
