package com.company;

import java.util.Scanner;

public class Richard {

    public static void songs(){

        Scanner input = new Scanner(System.in);

        String myInput ="";

        while (!myInput.equals("sabbir")){

            System.out.print("Please enter your first name: ");

            myInput = input.nextLine().toLowerCase();

            System.out.println(myInput);



        }


    }
}
