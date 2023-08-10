package com.company;

import java.util.Scanner;

public class SwitchMethods4545 {

    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your race: ");

        String myRace = input.nextLine().toLowerCase();

        switch (myRace){


            case "white":

                System.out.println("Super power.");

                break;

            case "black":

                System.out.println("Second power.");

                break;


            case "brown":

                System.out.println("Smart people.");

                break;

            default:

                System.out.println("I am not sure.");


        }
    }
}
