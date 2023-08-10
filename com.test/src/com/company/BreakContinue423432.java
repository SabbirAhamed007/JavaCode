package com.company;

import java.util.Scanner;

public class BreakContinue423432 {

    public static void main(String[] args){

        Scanner abc = new Scanner(System.in);

        String input = "";

        while (true){

            System.out.print("Please enter your input: ");

            input = abc.nextLine().toLowerCase();

            if (input.equals("ahamed"))
                continue;

            if (input.equals("sabbir")){

                System.out.println("I win !!!");

                break;



            }






        }
    }
}
