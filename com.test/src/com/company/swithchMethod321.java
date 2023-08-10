package com.company;

import java.util.Scanner;

public class swithchMethod321 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your car color: ");

        String myInput = input.nextLine();

        switch (myInput){

            case "Red":{

                System.out.println("Nice color. Girls like it.");
                break;
            }

            case "Black":{

                System.out.println("Common color.");
                break;
            }

            case "Blue":{

                System.out.println("Mans like it.");
                break;
            }

            default:

                System.out.println("Not so sure.");

        }

    }
}
