package com.company;

import java.util.Scanner;

public class WhileLoops543534 {

    public static void main(String[] args){

        Scanner myInput = new Scanner(System.in);

        String input = "";

        while (!input.equals("sabbir")){

            System.out.print("Please enter your input: ");

            input = myInput.nextLine().toLowerCase();

            System.out.println(input);


        }


    }

}
