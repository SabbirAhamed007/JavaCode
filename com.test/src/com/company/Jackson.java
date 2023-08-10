package com.company;

import java.util.Scanner;

public class Jackson {

    public void main(){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your car color: ");

        String myInput = input.nextLine().toLowerCase();

        switch (myInput){


            case "red":

                System.out.println("Red is a nice color.");
                break;


            case "white":

                System.out.println("White is official color.");

                break;

            case "black":

                System.out.println("Most common choice color.");

                break;

            case "blue":

                System.out.println("Blue is a nice choice for man");

                break;

            default:

                System.out.println("I am not sure.");

        }

    }
}
