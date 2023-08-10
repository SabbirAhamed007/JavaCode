package com.company;

import java.util.Scanner;

public class Whileloops302 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String myInput = "";

        while (!myInput.equals("sabbir")){

            System.out.print("Please enter your name: ");

            myInput = input.nextLine().toLowerCase();




        }



    }
}
