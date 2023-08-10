package com.company;

import java.util.Scanner;

public class InputTaker {

    public void InputTaker(){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String myInput = input.nextLine().toLowerCase();

        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        input.nextLine().toLowerCase();

        System.out.print("Please enter your jursey number: ");
        int JerseyNumber = input.nextInt();
        input.nextLine().toLowerCase();

        System.out.print("Please enter your team name: ");
        String teamName = input.nextLine().toLowerCase();
        input.nextLine().toLowerCase();


        System.out.println("My name is: " + myInput);
        System.out.println("Age is: " + age);
        System.out.println("Jersey number is: " + JerseyNumber);
        System.out.println("Team: " + teamName);





    }
}
