package com.company;

import java.util.Scanner;

public class SwitchesInJava {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter today: ");

        String toDay = input.nextLine().toLowerCase();

        switch (toDay){


            case "sunday":

                System.out.println("Day off for all.");
                break;

            case "monday":

                System.out.println("It's a work day.");

                break;

            case "tuesday":

                System.out.println("It's a work day.");

                break;

            case "wednesday":

                System.out.println("It's a work day.");

                break;

            case "thursday":

                System.out.println("It's a work day.");

                break;

            case "friday":

                System.out.println("It's a work day.");

                break;

            case "saturday":

                System.out.println("Some office close and some office open.");

                break;

            default:

                System.out.println("I am not sure. Please enter today.");

        }



    }
}
