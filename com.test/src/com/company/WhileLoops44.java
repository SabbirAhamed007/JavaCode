package com.company;

import java.util.Scanner;

public class WhileLoops44 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String input = "";

        while (!input.equals("sabbir")){

            System.out.print("Please enter your name: ");

            input = scanner.nextLine().toLowerCase();
            System.out.println(input);

        }

    }
}
