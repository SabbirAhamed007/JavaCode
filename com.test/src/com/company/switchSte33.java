package com.company;

import java.util.Scanner;

public class switchSte33 {

    public static void CarColor(String color){

        Scanner carColor = new Scanner(System.in);

        System.out.print("Please enter the car color: ");

        String typeColor = carColor.nextLine();

        switch (color){

            case "Red":
                System.out.println("Selling chance is very high.");
                break;

            case "Blue":
                System.out.println("Selling chance is high.");

                break;

            case "Black":
                System.out.println("Selling chance is Ok.");

                break;

            case "White":
                System.out.println("Selling chance is low.");

                break;

            default:

                System.out.println("Not sure.");





        }



    }
}
