package com.company;

import java.util.Scanner;

public class Catty {

    public static void myCatty(){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your cat name: ");

        String myInput = input.nextLine().toLowerCase();

        System.out.println(myInput);


    }
}
