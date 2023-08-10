package com.company;

import java.util.Scanner;

public class WhileLoops84 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String myInput = "";

        while (!myInput.equals("sabbir")){

            System.out.print("myInput: ");

            myInput = input.nextLine().toLowerCase();


        }


    }
}
