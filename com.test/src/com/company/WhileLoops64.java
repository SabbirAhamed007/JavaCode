package com.company;

import java.util.Scanner;

public class WhileLoops64 {

    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        System.out.print("Please enter what you want to do: ");

        String myInput = input.nextLine().toLowerCase();

        while (!myInput.equals("quit")){

            System.out.print("Please enter your name: ");

            String name = input.nextLine().toLowerCase();

            System.out.println(name);

            System.out.print("Please enter your car color: ");

            input.nextLine().toLowerCase();

            String color = input.nextLine().toLowerCase();

            System.out.println(color);

        }
    }
}
