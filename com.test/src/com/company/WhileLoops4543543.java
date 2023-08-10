package com.company;

import java.util.Scanner;

public class WhileLoops4543543 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String input = "";

        while (!input.equals("sabbir")){

            System.out.print("Input: ");

            input = scanner.nextLine().toLowerCase();

            System.out.println(input);


        }


    }
}
