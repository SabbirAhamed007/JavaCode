package com.company;

import java.util.Scanner;

public class IfElseTest1 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter current temperature: ");

        int temp = input.nextInt();


        if (temp > 20 && temp < 30){

            System.out.println("Nice outside.");
        }

        else if (temp >= 19 ){

            System.out.println("cold outside.");
        }

        else if (temp <= 31){

            System.out.println("It's hot. Drink planty of water.");
        }

        else

            System.out.println("I am not sure.");

    }
}
