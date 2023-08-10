package com.company;

import java.util.Scanner;

public class ColorTest56 {

    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        String myInput = "";


        while(!myInput.equals("#ebng5")){

            System.out.print("Please enter your color: ");

            myInput = input.nextLine().toLowerCase();

            System.out.println(myInput);







        }
    }
}
