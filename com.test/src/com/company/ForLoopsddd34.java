package com.company;

import java.util.Scanner;

public class ForLoopsddd34 {

    public static void main(String[] args){

        Scanner fName = new Scanner(System.in);

        System.out.print("Please enter your first name: ");

        String myFName = fName.nextLine().toLowerCase();

        if (myFName.equals("sabbir")){

            System.out.print("You have select my first name, Cong8.");


        }

        else if (myFName.equals("ahamed")){

            System.out.println("This is my last name. Please enter the first name: ");



        }

        else {

            System.out.println("Wrong Answare. Better luck next time. ");
        }


    }
}
