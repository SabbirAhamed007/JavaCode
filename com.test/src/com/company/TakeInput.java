package com.company;

import java.util.Scanner;

public class TakeInput {

    public static void main(String[] args){


        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your name?: ");

        String myInput = scan.nextLine().toLowerCase();

        System.out.print("How old are you?: ");
        int age = scan.nextInt();
        scan.nextLine().toLowerCase();

        System.out.print("What is your club name?: ");
        String clubName = scan.nextLine().toLowerCase();

        System.out.print("What is your jersey number?: ");
        int jerseyNumber = scan.nextInt();


        System.out.println("Your name is : " + myInput);
        System.out.println("Your age is: "+ age);
        System.out.println("Club is: "+ clubName);
        System.out.println("Jersey Number: "+ jerseyNumber);






    }
}
