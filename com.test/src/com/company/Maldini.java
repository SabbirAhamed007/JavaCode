package com.company;

import java.util.Scanner;

public class Maldini {

    public void pm(){

        Scanner inout = new Scanner(System.in);

        System.out.print("Please enter fan name: ");

        String myName = inout.nextLine().toLowerCase();

        if (myName.equals("sabbir")){

            System.out.println("Correct");
        }

        else {

            System.out.println("I am not sure.");
        }

    }
}
