package com.company;

import java.util.Scanner;

public class IfCon432432 {

    public static void main(String[] args){

        Scanner temp = new Scanner(System.in);
        System.out.print("Please enter the current temperature: ");
        int tempNow = temp.nextInt();

        if (tempNow >=20 && tempNow <= 30)
            System.out.println("Nice out side.");

        else if (tempNow < 20 )
            System.out.println("It's cold take a jacket.");

        else
            System.out.println("It's hot. drink planty of water.");
    }
}
