package com.company;

import java.util.Scanner;

public class WhileLoops282 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String myInput = "";



        while (!myInput.equals(10) ){
            System.out.print("Please enter your lucky number: ");
            myInput = input.nextLine().toLowerCase();
            System.out.print("You have entered: " + myInput+ ". Not the result. Try again.");
            break;

        }


    }
}
