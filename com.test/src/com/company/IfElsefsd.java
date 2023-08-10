package com.company;

import java.util.Scanner;

public class IfElsefsd {

    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");

        String myInput = input.nextLine().toLowerCase();

        if (myInput == "ahamed"){

            System.out.println("It's his last name.");

        }

        else if (myInput == "sabbir"){

            System.out.println("Cong8 , you are right. His name is Sabbir.");
        }

        else{
            System.out.println("No Luck this time.");

        }




    }
}
