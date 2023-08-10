package com.company;

import java.util.Scanner;

public class ifelse423432 {

    public static void main(String[] args){

        Scanner temp = new Scanner(System.in);

        System.out.print("Please enter current temparature: ");

        int input = temp.nextInt();

        if (input > 20 && input < 30){

            System.out.println("Nice wheater outside: ");
        }

        else if (input < 20){

            System.out.println("Cold outside. take a jacket.");
        }

        else

            System.out.println("It's hot. Drink planty of water.");



    }
}
