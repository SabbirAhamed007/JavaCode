package com.company;

import java.util.Scanner;

public class NestedForLup {

    public static void main(String[] args){

        Scanner inout = new Scanner(System.in);



        System.out.print("Please enter number of rows: ");

        int rows = inout.nextInt();

        System.out.print("Please enter number of coloumns: ");

        int coloumns = inout.nextInt();

        System.out.println("Please enter any symbol: ");

        String symbol = inout.next();

        for (int i = 1; i <= rows; i++){

            System.out.println();

            for (int j = 1; j <= coloumns; j++){

                System.out.print(symbol);
            }
        }








    }
}
