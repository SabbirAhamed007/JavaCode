package com.company;

import java.util.Scanner;

public class WhileLopps {

    public static void main(String[] args){

        Scanner temp = new Scanner(System.in);

        String currentTemp = "";

        while (!currentTemp.equals("20")){

            System.out.print("Please enter temp again: ");

            currentTemp = temp.nextLine().toLowerCase();

        }


    }
}
