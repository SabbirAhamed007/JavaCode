package com.company;

import java.util.Scanner;

public class TestingWithoutStatic {

    public void main(){


        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");

        String myName = input.nextLine().toLowerCase();

        System.out.println(myName);
    }
}
