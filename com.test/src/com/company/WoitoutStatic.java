package com.company;

import java.util.Scanner;

public class WoitoutStatic {

    public void main(){

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String myName = input.nextLine().toUpperCase();
        System.out.println(myName);

    }
}
