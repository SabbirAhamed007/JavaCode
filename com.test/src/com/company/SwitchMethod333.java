package com.company;

import java.util.Scanner;

public class SwitchMethod333 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter what day is it: ");

        String myInput = input.nextLine().toLowerCase();

        switch (myInput){


            case "sunday":{

                System.out.println("It is holiday . Enjoy...");
                break;
            }

            case "saturday":{

                System.out.println("It is holiday too.");
                break;
            }

            default:

                System.out.println("It's a working day.");






        }

    }
}
