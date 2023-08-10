package com.company;

import java.util.Scanner;

public class SwitchMethod343 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your color: ");

        String myColor = input.nextLine().toLowerCase();

        switch (myColor){


            case "red":{


                System.out.println("Red is a nice color girls like it.");

                break;
            }

            case "white":{

                System.out.println("White is a official color.");

                break;

            }

            case "black":{

                System.out.println("Black is common color.");

            }

            default:

                System.out.println("I am not sure.");




        }


    }
}
