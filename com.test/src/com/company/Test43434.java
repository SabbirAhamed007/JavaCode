package com.company;

import java.util.Scanner;

public class Test43434 {

    public static void main(String[] args){

        Scanner inout = new Scanner(System.in);
        System.out.print("Please enter your name: ");

        String color = inout.nextLine().toLowerCase();

        if (color.equals("red")){

            System.out.println("Your got it.");
        }

        else if (color.equals("black")){

            System.out.println("Balck is a sobor color.");
        }

        else if (color.equals("white")){

            System.out.println("White is common offfical color.");
        }
        else if(color.equals("blue")){

            System.out.println("Manyly color.");
        }
        else

            System.out.println("I am not sure.");

    }
}
