package com.company;

import java.util.Scanner;

public class IfStatement434 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter current temparature: ");

        float myINput = input.nextFloat();

        if (myINput > 20 && myINput < 30){

            System.out.println("Nice weather outside. Enjoy outing.");


        }

        else if (myINput <= 30){

            System.out.println("It's hot outside. drink water.");

        }


        else if (myINput >=20){

            System.out.println("It is cold outside. Take your jacket.");
        }

        else{

            System.out.println("Please listen to radio.");
        }
    }
}
