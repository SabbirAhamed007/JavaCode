package com.company;

import java.util.Scanner;

public class WithStatic200 {

    public static void main(){


        Scanner inl = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String myNab = inl.nextLine().toLowerCase();

        System.out.println(myNab);
    }
}
