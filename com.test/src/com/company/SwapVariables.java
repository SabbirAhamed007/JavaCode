package com.company;

import java.util.Scanner;

public class SwapVariables {

    public static void main(String[] args){


        String x = "Red Water";
        String y = "Green Water";

        String z;

        z = x;
        x = y;
        y = z;

        System.out.println("x : " + x);
        System.out.println("y: " + y);


        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name: ");

        String name = scanner.nextLine().toLowerCase();

        System.out.print("What is your age: ");

        int age = scanner.nextInt();

        scanner.nextLine().toLowerCase();

        System.out.print("What is your favourite food: ");
        String food = scanner.nextLine();



        System.out.print("Please enter the size: ");

        int size = scanner.nextInt();


        System.out.println(name);
        System.out.println(age);
        System.out.println(food);
        System.out.println(size);


    }
}
