package com.company;

import java.util.Scanner;

public class IfStatement34 {

    public static void main(String[] args){

        Scanner temperature = new Scanner(System.in);
        System.out.print("Please enter the current temperature: ");
        int todayTemp = temperature.nextInt();

        if(todayTemp > 30) {
            System.out.println("It's a ho day.");
            System.out.println("Drink planty of water.");

        }else if (todayTemp <= 30 && todayTemp > 20) {

            System.out.println("Today is nice outside.");
        }else {

            System.out.println("It's cold today.");
            System.out.println("Take a jacket with you.");
        }



    }
}
