package com.company;

import java.util.Date;
import java.util.Scanner;

public class mixedup21 {

    public static void main(String[] args){

        int x = 5;
        float y = x + 5.0F;

        System.out.println(y);


        Date now = new Date();
        now.getTime();
        System.out.println(now);

        Scanner myNmae = new Scanner(System.in);

        System.out.print("Please enter your name: ");

        String name = myNmae.nextLine();

        switch (name){


            case "Sabbir":
                System.out.println("Your roll 21");
                break;

            case "John":
                System.out.println("Your roll 1");
                break;

            case "Jaber":
                System.out.println("You are 51");
                break;

            default:

                System.out.println("Please connect to student help centre.");



        Scanner temp = new Scanner(System.in);
        System.out.print("Please enter current temparature: ");
        int tempNow = temp.nextInt();

        if (tempNow >= 30 && tempNow <= 20)
            System.out.println("It's nice outside.");

        else if (tempNow > 30)
            System.out.println("It's hot. Drink planti of water.");

        else
            System.out.println("It's cold outside. Take your jacket.");




        }

    }
}
