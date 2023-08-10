package com.company;

import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your preferred car color: ");

        String myInput = input.nextLine().toLowerCase();

        switch (myInput){


            case "red":

                System.out.println("Red is not available now.");

                break;


            case "black":

                System.out.println("Black is common color. We have a lot of black color car.");

                break;

            case "white":

                System.out.println("White is an official color.");

                break;

            case "blue":

                System.out.println("Blue is a nice manly color.");

                break;
            default:

                System.out.println("I am not sure. Check inventory section now. ");
        }


    }
}
