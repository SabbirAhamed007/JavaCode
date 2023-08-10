package com.company;

import java.util.Scanner;

public class WhileLoops202 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String myInput = "";

        while (!myInput.equals("red")){

            System.out.print("Entered: ");
            myInput = input.nextLine().toLowerCase();
            System.out.println(myInput);

        }

    }
}
