package com.company;

import java.util.Scanner;

public class SwitchMt {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your car color: ");

        String color = input.nextLine().toLowerCase();

        switch (color){

            case "black":

                System.out.println("Black is a common color.");

                break;

            case "white":

                System.out.println("White is a official color.");

                break;

            case "red":

                System.out.println("Red looks good. Girls like it.");

                break;

            default:

                System.out.println("I am not sure.");


        }
    }
}
