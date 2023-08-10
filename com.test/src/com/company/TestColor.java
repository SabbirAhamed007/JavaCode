package com.company;

import java.util.Scanner;

public class TestColor {

    public static void color(){


        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");

        String myInput = input.nextLine().toLowerCase();


        if (myInput.equals("red"))

            System.out.println("Red");

        else

            System.out.println("I am not sure.");


    }
}
