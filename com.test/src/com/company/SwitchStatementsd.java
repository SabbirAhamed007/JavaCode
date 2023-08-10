package com.company;

import java.util.Scanner;

public class SwitchStatementsd {

    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your color: ");

        String myInput = input.nextLine().toLowerCase();

        switch (myInput){


            case "red":

                System.out.print("Red is a nice color. Girls like it.");

                break;

            case "black":

                System.out.println("Black is a common color");

                break;

            case "white":

                System.out.println("White is a official color.");
                break;

            default:{

                System.out.println("I am not sure.");
            }
        }
    }
}
