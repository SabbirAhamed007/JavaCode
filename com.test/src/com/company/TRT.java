package com.company;

import java.util.Scanner;

public class TRT {

    public static void main(String[] args){

        Scanner inout = new Scanner(System.in);

        System.out.print("Please enter your name: ");

        String myName = inout.nextLine().toLowerCase();

        System.out.print("How old are you: ");
        int age = inout.nextInt();
        inout.nextLine();

        System.out.print("what is your favourite food: ");
        String food = inout.nextLine();

        System.out.print("What is your favourite team: ");
        String team = inout.nextLine();

        System.out.println("Hello !" + myName +".");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your favourite food is "+ food + ".");
        System.out.println("Your favourite team is "+ team +"." );
    }
}
