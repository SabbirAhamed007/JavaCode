package com.company;

import java.util.Scanner;

public class Laptop {

    public static void myLaptop(){

        Scanner inout = new Scanner(System.in);

        System.out.print("Please enter your laptop name: ");

        String myInput = inout.nextLine().toLowerCase();

        switch (myInput){

            case "lg":{

                System.out.println("LG is a good brand. I am not sure about the model.");
                break;


            }

            case "hp":{


                System.out.println("HP is ok, depends on model.");
                break;
            }

            case "mac": {

                System.out.println("Mac is good for professional people.");
                break;
            }

            default:

                System.out.println("I am not sure about it.");



        }

    }
}
