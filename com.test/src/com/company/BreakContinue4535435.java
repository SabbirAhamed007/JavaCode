package com.company;

import java.util.Scanner;

public class BreakContinue4535435 {


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

                System.out.println(myInput);
        }


    }
}
