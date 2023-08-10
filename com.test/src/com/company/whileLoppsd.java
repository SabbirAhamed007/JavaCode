package com.company;

import java.util.Scanner;

public class whileLoppsd {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String input = "";

        while (!input.equals("quit")){

            System.out.print("Please enter your input: ");

            input = scan.nextLine().toLowerCase();

            System.out.println(input);

        }





    }
}
