package com.company;

import java.util.Scanner;

public class WithoutString333 {

    public void main(){

        Scanner inout = new Scanner(System.in);

        System.out.print("Please enter your name: ");

        String name = inout.nextLine().toLowerCase();
        System.out.println(name);
    }
}
