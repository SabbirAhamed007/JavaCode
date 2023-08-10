package com.company;

import java.util.Scanner;

public class WhileLoopsddd {

    public static void main(String[] args){


        Scanner inout = new Scanner(System.in);


        String myInput = "";

        while (!myInput.equals("sabbir")){

            System.out.print("Please enter your name: ");

            myInput = inout.nextLine().toLowerCase();

        }

        if (myInput.equals("sabbir")){


            System.out.println("Your name Sabbir and we are looking for you. Please call 987-333-4332");
        }

        while (!myInput.equals("ahamed")){

            System.out.print("Please enter your first name: ");

            myInput = inout.nextLine().toLowerCase();
        }




    }
}
