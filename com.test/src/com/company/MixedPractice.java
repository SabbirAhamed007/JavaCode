package com.company;

import java.util.Scanner;

public class MixedPractice {

    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        System.out.print("Please enter input: ");

        int abc = input.nextInt();

        if (abc == 1){

            System.out.println("Red car selling chance is high.");


        }

        else if (abc == 2){

            System.out.println("Blue car selling chance is high. Man likes it.");
        }

        else if (abc == 3){


            System.out.println("Black car is ok.");
        }

        else

            System.out.println("It's ok. No option for color.");



    }
}
