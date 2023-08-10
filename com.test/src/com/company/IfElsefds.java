package com.company;

import java.util.Scanner;

public class IfElsefds {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("PLease enter your car color: ");

        String myInput = input.nextLine().toLowerCase();

        if (myInput.equals("red")){

            System.out.println("Red is a nice color. Chance is high to sale it.");
        }

        else if (myInput.equals("black")){

            System.out.println("Black is common color.");
        }

        else if (myInput.equals("white")){

            System.out.println("White is official color");
        }

        else

            System.out.println("I am not sure.");
    }
}
