package com.company;

import java.util.Scanner;

public class VeriTest {

    public static void main(String[] args){


        String x = "red water";
        String y = "White water";

        String z;

        z = x;

        x = y;

        y = z;

        System.out.println("x: " + x);
        System.out.println("y: " + y);


        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");

        String name = input.nextLine();

        System.out.print("How old are you: ");

        int age = input.nextInt();



        input.nextLine();

        System.out.print("Please enter your team: ");



        String team = input.nextLine();


    }
}
