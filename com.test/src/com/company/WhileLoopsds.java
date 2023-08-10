package com.company;

import java.util.Scanner;

public class WhileLoopsds {

    public static void main(String[] args){


        Scanner input = new Scanner(System.in);


        String myInput = "";

        while (!myInput.equals("sabbir")) {

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
