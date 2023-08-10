package com.company;

import java.util.Scanner;

public class WhileLoops40 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String myInput = "";

        while (!myInput.equals("quit")){

            System.out.print("Please enter input: ");

            myInput = input.nextLine().toLowerCase();

            System.out.println(input);
        }
    }
}
