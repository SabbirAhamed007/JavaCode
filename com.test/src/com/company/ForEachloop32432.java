package com.company;

import java.util.Scanner;

public class ForEachloop32432 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your favourite color: ");

        String myINput = input.nextLine().toLowerCase();

        for (int i = 0; i < myINput.length() ; i++){

            while (!myINput.equals("red")){

                System.out.println("Please enter your favourite color: ");

                break;
            }


        }
    }
}
