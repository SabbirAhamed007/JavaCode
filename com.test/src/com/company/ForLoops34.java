package com.company;

import java.util.Scanner;

public class ForLoops34 {

    public static void main(String[] args){

        Scanner temp = new Scanner(System.in);

        System.out.print("Please enter current temp: ");

        int currentTemp = temp.nextInt();

        for (currentTemp = 20; currentTemp < 25; currentTemp++){

            System.out.println("It's a hot day.");
        }
    }
}
