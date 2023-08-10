package com.company;

import java.util.Scanner;

public class WhileLoops549 {

    public static void main(String[] args){

        Scanner myInput = new Scanner(System.in);

        String input = "";

        while (!input.equals("sabbir")){

            System.out.print("Please try your luck again: ");

            input = myInput.nextLine().toLowerCase();



        }
        System.out.println("You got it.");
    }
}
