package com.company;

import java.util.Scanner;

public class Songs {

    public void mySongs(){


        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the song title: ");

        String myInput = input.nextLine().toLowerCase();

        switch (myInput){

            case "like a payer":

                System.out.println("It's by Madonna.");
                break;

            case "like a virgin":

                System.out.println("It's by Madonna");

                break;

            default:

                System.out.println("I am not sure about the singer.");




        }



    }
}
