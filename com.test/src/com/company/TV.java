package com.company;

import java.util.Scanner;

public class TV {

    public static void myTV(){


        Scanner input = new Scanner(System.in);
        System.out.print("Please enter you TV name: ");

        String myINput = input.nextLine().toLowerCase();

        if (myINput.equals("sony")){

            System.out.println("Sony always a good choice as a TV.");
        }

        else if (myINput.equals("LG")){

            System.out.println("LG has the best OLED TV in the market.");
        }

        else if (myINput.equals("vizio")){

            System.out.println("It's a budget friendly TV.");
        }

        else

            System.out.println("I am not sure.");




    }
}
