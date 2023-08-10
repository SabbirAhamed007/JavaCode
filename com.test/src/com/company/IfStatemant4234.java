package com.company;

import java.util.Scanner;

public class IfStatemant4234 {

    public static void main(String[] args){

        Scanner temparature = new Scanner(System.in);

        System.out.print("Please enter the current temparature: ");

        int currentTemp = temparature.nextInt();

        if (currentTemp > 20 && currentTemp < 30) {


            System.out.println("It's nice outside. Enjoy the day");
        }

        else if (currentTemp >= 30){

            System.out.println("It's hot outside please drink water.");
        }

        else if (currentTemp == 20){

            System.out.println("It's best time for outing.");



        }

        else {


            System.out.println("It's a cold day. Take jacket.'");
        }


    }
}
