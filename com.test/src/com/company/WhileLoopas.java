package com.company;

import java.util.Scanner;

public class WhileLoopas {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String input = "";

        while (!input.equals("Sabbir Ahamed")){

            System.out.print("Please enter anything to break the lock: ");

            input = scan.nextLine().toLowerCase();

            System.out.println(input);


        }



    }
}
