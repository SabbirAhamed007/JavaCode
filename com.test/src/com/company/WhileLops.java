package com.company;

import java.util.Scanner;

public class WhileLops {

    public static void main(String[] args){


        Scanner inout = new Scanner(System.in);

        String myINput = "";


        while (!myINput.equals("sabbir")){

            System.out.print("Please enter your name: ");

            myINput = inout.nextLine().toLowerCase();

            System.out.println(myINput);



        }

    }
}
