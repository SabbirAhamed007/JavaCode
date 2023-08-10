package com.company;

import java.util.Scanner;

public class StringPrac1 {

    public static void main(String[] args){

        String input = "Sabbir47484Ahamed";

        String pp = input.replace("47484" , " ");
        System.out.println(pp);


        Scanner ini = new Scanner(System.in);

        System.out.print("Please enter your name: ");

        String name = ini.nextLine().toLowerCase();

        switch (name){

            case "sabbir":
                System.out.println("Correct name: Sabbir." );
                break;

            case "Ahamed":
                System.out.println("It's last name.");
                break;

            default:

                System.out.println("I dont know.");
        }

    }
}
