package com.company;

import java.util.Scanner;

public class IfElseLogical333 {

    public static void main(String[] args){

        Scanner reservation = new Scanner(System.in);

        System.out.print("Please enter room you like: ");

        String room = reservation.nextLine();

        if (room == "Premium"){

            System.out.println("You have select premium room. Rent is $500 per night.");
        } else if (room == "Gold"){

            System.out.println("You have select gold room. You have free breakfast in the morning.");
        } else if (room == "Silver"){

            System.out.println("You have silver room. Seabeach view.");
        } else {

            System.out.println("Economy room. two guest only.");
        }
    }
}
