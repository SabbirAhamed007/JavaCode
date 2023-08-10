package com.company;

import java.util.Scanner;

public class NestedLoops2 {

    public static void main(String[] args){

        Scanner inout = new Scanner(System.in);

        int rows;
        int columns;

        String sysmbol = "";

        System.out.print("Please enter number of rows: ");

        rows = inout.nextInt();

        System.out.print("Please enter number of column: ");

        columns = inout.nextInt();


        System.out.print("Enter symbol to use: ");

        sysmbol = inout.next();

        for (int i = 1; i <= rows; i++ ){

            System.out.println();

            for (int j = 1; j <= columns; j++){

                System.out.print(sysmbol);
            }
        }







    }
}
