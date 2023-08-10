package com.company;

import java.util.Scanner;

public class WhileLoops12 {

    public static void main(String[] args){



        Scanner input = new Scanner(System.in);

        String name ="";

        while (name.isBlank()){

            System.out.print("Please enter your name: ");

            name = input.nextLine().toLowerCase();
        }

        System.out.println("Hello !!! "+ name);


    }
}
