package com.company;

import java.util.Scanner;

public class Switch282 {

    public static void main(String[] args){

        Scanner inut = new Scanner(System.in);
        System.out.print("Please enter your fabourite color: ");

        String myColor = inut.nextLine().toLowerCase();


        switch (myColor){


            case "red":
                System.out.println("Red is a nice color. Girls like it.");
                break;

            case "white":
                System.out.println("White official color.");
                break;

            default:

                System.out.println("I am not sure.");
        }
    }




}
