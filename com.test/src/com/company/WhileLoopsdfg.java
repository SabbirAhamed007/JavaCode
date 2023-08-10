package com.company;

import java.util.Scanner;

public class WhileLoopsdfg {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String myInput = "";

        while (!myInput.equals("red")){

            System.out.print("Please enter your color: ");

            myInput = input.nextLine().toLowerCase();


            System.out.println("Your have enter: " + myInput);


        }

    }
}
