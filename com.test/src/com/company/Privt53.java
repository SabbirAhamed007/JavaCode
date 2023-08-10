package com.company;

import java.util.Scanner;

public class Privt53 {

    private static void main(){

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");

        String name = input.nextLine().toLowerCase();
        System.out.println(name);
    }
}
