package com.company;

import java.util.Scanner;

public class Jjsjjs {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your color: ");

        String myInput = input.nextLine().toLowerCase();

        if (myInput.equals("red")){

            System.out.println("Red is a nice color.");

        }

        else if(myInput.equals("white")){

            System.out.println("White is a common color.");
        }

        else if(myInput.equals("black")){

            System.out.println("Black is very common color.");
        }

        else if(myInput.equals("blue")){

            System.out.println("Blue is a manly color.");
        }

        else {

            System.out.println("I am not sure.");

        }



    }
}
