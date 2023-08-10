package com.company;

import java.util.Scanner;

public class WhileLoopsdf {

    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        String myInput = "";


        while (!myInput.equals("pigeon")){

            System.out.print("Please enter your pet : ");

            myInput = input.nextLine().toLowerCase();

            System.out.println(myInput);



        }


    }
}
