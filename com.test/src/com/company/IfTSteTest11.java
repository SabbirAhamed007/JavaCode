package com.company;

import java.util.Scanner;

public class IfTSteTest11 {

    public static void main(String[] args){


        Scanner age = new Scanner(System.in);

        System.out.print("Please enter your age: ");

        int myAge = age.nextInt();

        if (myAge >= 18 && myAge <= 64){

            System.out.println("You are fully responsible for your activity.");
        }

        else if (myAge >= 65){

            System.out.println("Your should apply for elderly benefit.");
        }

        else if (myAge <= 18){

            System.out.println("You are under 18. So not all the things you can do.");
        }

        else {

            System.out.println("I am not sure.");
        }
    }
}
