package com.company;

import java.util.Scanner;

public class IfElse3330 {

    public static void main(String[] args){


        Scanner myInput = new Scanner(System.in);

        System.out.print("Please enter your name: ");

        String name = myInput.nextLine().toLowerCase();

        if (name.equals("sabbir")){

            System.out.println("Please take new course English.");
        }

        else if (name.equals("ahamed")){

            System.out.println("Ahamed is Sabbir's last name.");
        }

        else {

            System.out.println("I am not sure.");
        }

    }
}
