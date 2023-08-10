package com.company;

import java.util.Scanner;

public class While4433 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);


        System.out.print("Please enter your name: ");

        String myInput = input.nextLine().toLowerCase();

        while (true){

            if (myInput.equals("ahamed")){

                System.out.print("Ahamed is your last name. Please enter first name: ");


                break;



            }




            else if (myInput.equals("sabbir"))

                System.out.println("You are right. Sabbir is your first name.");







        }


    }
}
