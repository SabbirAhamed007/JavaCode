package com.company;

import java.util.Scanner;

public class JackSparrow {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter temp: ");

        String tempNow = input.nextLine().toLowerCase();

        if (tempNow.equals("hot")){

            System.out.println("It is hot day. Drink water.");
        }

        else if (tempNow.equals("nice")){

            System.out.println("NIce weather outside.");
        }

        else if (tempNow.equals("cold")){

            System.out.println("Cold outside. Take jacket");
        }



    }
}
