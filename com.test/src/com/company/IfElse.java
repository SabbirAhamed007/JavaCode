package com.company;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number: ");

        int myNum = Integer.parseInt(input.nextLine());

        if (myNum == 1){

            System.out.println("Summer.");
        }

        else if (myNum ==2){

            System.out.println("Winter.");
        }

        else
            System.out.println("I dont know.");

    }
}
