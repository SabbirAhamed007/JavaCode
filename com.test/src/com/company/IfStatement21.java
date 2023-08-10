package com.company;

import java.util.Scanner;

public class IfStatement21 {

    public static void main(String[] args){

        Scanner speed = new Scanner(System.in);

        System.out.print("Please enter your car's speed: ");

        int currentSpeed = speed.nextInt();

        if (currentSpeed >= 80){
            System.out.println("Stop your car.");
            System.out.println("You have a speeding ticker for $50.");

        }

        else if(currentSpeed >=65)
            System.out.println("Exccelent driving skills.");

        else
            System.out.println("Please drive as per road speed.");
    }
}
