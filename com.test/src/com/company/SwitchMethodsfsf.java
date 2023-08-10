package com.company;

import java.util.Scanner;

public class SwitchMethodsfsf {

    public static void main(String[] args){

        Scanner myINput = new Scanner(System.in);

        System.out.print("Please enter your color again: ");

        String input = "";

        input = myINput.nextLine().toLowerCase();

        switch (input){


            case "red":

                System.out.println("Red is a nice color");

                break;


            case "black":

                System.out.println("Black is common color.");

                break;

            case "white":

                System.out.println("White is official color.");

                break;

            default:

                System.out.print("Please enter your color again: ");

                switch (input){


                    case "red":

                        System.out.println("Red is a nice color");

                        break;


                    case "black":

                        System.out.println("Black is common color.");

                        break;

                    case "white":

                        System.out.println("White is official color.");

                        break;

                    default:

                        System.out.println("Better next time.");




                }




        }


    }
}
