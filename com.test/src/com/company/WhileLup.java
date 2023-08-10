package com.company;

import java.util.Scanner;

public class WhileLup {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String name = "";

        while (name.isBlank()){

            System.out.print("Enter your name: ");

            name = input.nextLine().toLowerCase();



        }

        System.out.println("Hallo ! " + name);
    }


}
