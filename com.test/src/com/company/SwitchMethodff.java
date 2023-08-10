package com.company;

import java.util.Scanner;

public class SwitchMethodff {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");

        String myInput = input.nextLine().toLowerCase();

        switch (myInput){


            case "jaber":{
                System.out.println("Only xpath dealling capable.");
                break;
            }

            case "pavel":{

                System.out.println("Quality automation QA.");
                break;
            }

            case "sabbir":{

                System.out.println("Quality automation QA. Knows Programming.");
                break;
            }

            default:{
                System.out.println("I am not sure.");
                break;

            }




        }

    }
}
