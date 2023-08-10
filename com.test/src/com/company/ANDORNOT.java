package com.company;

import java.util.Scanner;

public class ANDORNOT {

    public static void main(String[] args){


        int temp = 25;

        if (temp > 30 ){

            System.out.println("It is hot outside.");
        }

        else if (temp >= 20 && temp <= 30){

            System.out.println("It is worm outside.");
        }

        else {

            System.out.println("It is cold outside.");
        }


        Scanner input = new Scanner(System.in);
        System.out.print("Your are playing a game press Q to quit: ");

        String response = input.nextLine().toLowerCase();

        if (response.equals("q") || (response.equals("Q"))){

            System.out.println("Game Quit !!!");


        }

        else {

            System.out.println("Your are playing the game.");
        }





        Scanner myInput = new Scanner(System.in);

        System.out.print("Your are playing a game press Q to quit: ");

        String myResponse = myInput.nextLine().toLowerCase();

        if (!myResponse.equals("q") && !myResponse.equals("Q")){

            System.out.println("Your are playing the game.");


        }

        else {

            System.out.println("Game Quit !!!");
        }



    }
}
