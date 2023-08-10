package com.company;

import java.util.Scanner;

public class CarAvilable {

    public static void main(String[] args){

        Scanner carColor = new Scanner(System.in);

        System.out.print("Please enter the car color you like to buy: ");

        String color = carColor.nextLine();

        if (color == "Red") {



            System.out.println("Selling chance is very high.");


            }else if (color == "Blue") {
            System.out.println("Selling chance is high.");

            }else if (color == "Black") {

            System.out.println("Selling chance is 50/50");

            }else if (color == "White") {
            System.out.println("Selling chance is low.");

            }else {

            System.out.println("Not sure.");
        }

    }
}
