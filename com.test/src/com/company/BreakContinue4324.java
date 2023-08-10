package com.company;

import java.util.Scanner;

public class BreakContinue4324 {

    public static void main(String[] args){


        Scanner nn = new Scanner(System.in);

        String input = "";


        while (!input.equals("xyz")){

            System.out.print("Please enter your input: ");

            input = nn.nextLine().toLowerCase();

            if (input.equals("xyz"))
            break;

            System.out.println(input);


        }
    }
}
