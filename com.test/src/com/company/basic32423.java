package com.company;

import java.util.Scanner;

public class basic32423 {

    public static void main(String[] args){

         int x = 5;
         int y = x + 10;

         String a = "1";

        Scanner printName = new Scanner(System.in);
        System.out.print("Please enter how many times you want to print your number: ");

        int number = printName.nextInt();

        for (number = 0; number < 500; number++)
            System.out.println("Sabbir "+ number);



    }
}
