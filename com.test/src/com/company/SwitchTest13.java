package com.company;

import java.util.Scanner;

public class SwitchTest13 {


    public static void main(String[] args){

        Scanner today = new Scanner(System.in);

        System.out.print("What is today?: ");

        String todayIs = today.nextLine().toLowerCase();

        switch (todayIs){


            case "monnday":

                System.out.println("It's my working day.");

                break;

            case "tuesday":

                System.out.println("It's my working day.");

                break;

            case "wednesday":

                System.out.println("It's my working day.");

                break;

            case "thursday":

                System.out.println("It's my working day.");

                break;


            case "friday":

                System.out.println("It's my working day.");

                break;


            case "saturday":

                System.out.println("It's my hollyday.");

                break;

            case "sunday":

                System.out.println("It's my hollyday.");

                break;


            default:

                System.out.println("Please enter today.");






        }

    }
}
