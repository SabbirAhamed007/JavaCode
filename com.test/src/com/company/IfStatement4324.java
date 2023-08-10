package com.company;

import java.util.Scanner;

public class IfStatement4324 {

    public static void main(String[] args){

        Scanner temp = new Scanner(System.in);
        System.out.print("Please enter current temperature: ");
        int currentTemp = temp.nextInt();

        if (currentTemp > 30) {
            System.out.println("It's a hot day.");
            System.out.println("Drink planty of water.");

        }
        else if (currentTemp > 20 && currentTemp <=30)

            System.out.println("Beautiful day, Enjoy.");
        else

            System.out.println("It's cold. Take jacket.");

    }
}
