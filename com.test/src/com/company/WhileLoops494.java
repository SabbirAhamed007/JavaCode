package com.company;

import java.util.Scanner;

public class WhileLoops494 {

    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        String myInput = "";

        while (true){

            System.out.print("Please enter your name: ");

            myInput = input.nextLine().toLowerCase();

            if (myInput.equals("ahamed"))
                continue;

            if (myInput.equals("sabbir"))

                break;



        }


    }
}
