package com.company;

import java.util.Scanner;

public class DoWhileLoops488 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String myInput = "";

        do{


            System.out.print("Please enter name try: ");

            myInput = input.nextLine().toLowerCase();

            System.out.println(myInput);



        } while (!myInput.equals("sabbir"));



    }
}
