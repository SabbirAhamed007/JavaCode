package com.company;

import java.util.Scanner;

public class IfElse46 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);



        String myINput = "";


        while (!myINput.equals("red")){

            System.out.print("Please enter your car color: ");

            myINput = input.nextLine().toLowerCase();

            if (myINput.equals("white")){

                System.out.print("Try again.");

            }
        }



    }
}
