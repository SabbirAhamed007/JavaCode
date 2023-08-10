package com.company;

import java.util.Scanner;

public class Tiktok {

    public static void myTiktok(){

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your color: ");

        String myInput = input.nextLine().toLowerCase();

        switch (myInput){

            case "sabbir":{

                System.out.println("Sabbir is on now.");
                break;
            }

            case "jaber":{

                System.out.println("Jaber is on now.");
                break;
            }

            case "pavel":{

                System.out.println("Pavel is on now.");

                break;
            }

            default:
                System.out.println("Open option now.");
        }


    }
}
