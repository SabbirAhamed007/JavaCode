package com.company;

import java.util.Scanner;

public class ifElse4535 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number: ");

        int myinput = input.nextInt();

        if (myinput == 0 || myinput == 9){

            System.out.print("Please enter the number: ");

        }

        else if (myinput % 5 == 0 && myinput % 3 == 0){


            System.out.print("It is divided by 3 and 5.");
        }

        else if (myinput == 2){

            System.out.print("You choose 2.");
        }
    }
}
