package com.company;

import java.util.Scanner;

public class StudentTable {

    public static void studentTen(){


        Scanner input = new Scanner(System.in);

        System.out.print("Please enter student name: ");

        String stName = input.nextLine().toLowerCase();

        switch (stName){

            case "sabbir":{


                System.out.println("Sabbir is in class ten.");
                break;

            }

            case "jaber":{

                System.out.println("Jaber is in class nine.");
                break;
            }

            case "Pavel": {

                System.out.println("Pavel is leading the team.");
                break;
            }

            default:

                System.out.println("I am not sure.");

        }


    }
}
