package com.company;

import java.util.Scanner;

public class SwitchMethod54 {

    public static void main(String[] args){


        Scanner inout = new Scanner(System.in);
        System.out.print("Please enter your name: ");

        String carColor = inout.nextLine().toLowerCase();

        switch (carColor){

            case "red":

                System.out.println("Red is a nice color. Girls like it.");
                break;



            case "white":
                System.out.println("White is a official color");
                break;

            case "blue":

                System.out.println("Blue is a nice manly color.");
                break;

            default:

                System.out.println("I am not sure.");
        }



    }
}
