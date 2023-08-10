package com.company;

import java.util.Scanner;

public class ForLoops56 {

    public static void main(String[] args){


        for (int i = 0 ; i < 5; i++)
            System.out.println("Hello Dhaka");


        Scanner inout = new Scanner(System.in);

        System.out.print("Please enter your number: ");

        int myInput = inout.nextInt();

        for (int i = 0; i < myInput ; i++)

            System.out.println(i);




    }
}
