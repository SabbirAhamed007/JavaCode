package com.company;

import java.util.Scanner;

public class EcaptionHandle21 {

    public static void main(String[] args){

        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter temp: ");

            int currentTemp = input.nextInt();

            System.out.println(currentTemp);
        }

        catch (Exception e){

            System.out.println("Please enter number.");
        }

    }
}
