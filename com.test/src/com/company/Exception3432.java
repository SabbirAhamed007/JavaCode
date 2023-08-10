package com.company;

import java.util.Scanner;

public class Exception3432 {

    public static void main(String[] args){

        try{

            Scanner input = new Scanner(System.in);

            System.out.print("Please enter your ID: ");

            int iD = input.nextInt();
            System.out.println(iD);



        }
        catch (Exception e){


            System.out.println("ID is a integer number.");


        }
    }
}
