package com.company;

import java.util.Scanner;

public class LogicalOParation21 {

    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit.");

        String response = input.nextLine();

        if (response.equals("q") || response.equals("Q")){

            System.out.println("You quit the game.");


        }

        else{

            System.out.println("You are still playing the game.");
        }
    }
}
