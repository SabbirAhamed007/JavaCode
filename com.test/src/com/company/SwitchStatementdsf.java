package com.company;

import java.util.Scanner;

public class SwitchStatementdsf {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the input: ");

        int myInput = input.nextInt();

        switch (myInput){

            case 1:
                System.out.println("You are first class passenger.");
                break;

            case 2:
                System.out.println("You are economy class passenger.");
                break;

            default:
                System.out.println("Please talk to management for your seat.");




        }

    }
}
