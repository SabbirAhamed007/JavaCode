package com.company;

import java.util.Scanner;

public class IFCondd {

    public static void main(String[] args){

        Scanner temp = new Scanner(System.in);

        System.out.print("Please enter current Temp: ");

        int tempNow = temp.nextInt();

        if (tempNow == 20 && tempNow > 20 && tempNow < 30){

            System.out.println("It's nice outside.");
        }

        else if (tempNow == 30 && tempNow > 30){

            System.out.println("It's hot day.");
        }

        else if(tempNow < 20 && tempNow > 17){

            System.out.println("Little chill outside");
        }

        else{
            System.out.println("It's cold outside.");

        }


    }
}
