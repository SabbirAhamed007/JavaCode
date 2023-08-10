package com.company;

import java.util.Scanner;

public class DoWhileLoopsde {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String input = "";

        do {

            System.out.print("Please enter your input: ");

            input = scanner.nextLine().toLowerCase();

            System.out.println(input);



        }
        while (!input.equals("Sabbir"));
    }
}
