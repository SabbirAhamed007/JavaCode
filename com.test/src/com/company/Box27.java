package com.company;

import java.util.Scanner;

public class Box27 {

    public void box1(){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your drone model: ");

        String myDrone = input.nextLine().toLowerCase();

        if (myDrone.equals("mini 3 pro")){

            System.out.println("It's a professional drone.");


        }

        if (myDrone.equals("mini 3")){

            System.out.println("It's for regular user.");
        }


    }
}
