package com.company;

import java.util.Scanner;

public class ColorCar {

    public static void CarColor(){

        Scanner inout = new Scanner(System.in);

        System.out.print("Please enter your color: ");

        String myInput = inout.nextLine().toLowerCase();

        switch (myInput){

            case "red":{

                System.out.println("Red is a nice color");

                break;

            }

            case "black":{

                System.out.println("Black is a common color");

                break;

            }

            case "White":{

                System.out.println("White is a official color");

                break;

            }

            default:

                System.out.println("I am not sure.");





        }

    }

}
