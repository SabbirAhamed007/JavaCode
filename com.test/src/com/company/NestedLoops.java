package com.company;

import java.util.Scanner;

public class NestedLoops {

    public static void main(String[] args){

       Scanner input = new Scanner(System.in);

       int rows;
       int column;
       String symbol;

        System.out.print("Please enter number of rows: ");

        rows = input.nextInt();

        System.out.print("Please enter number of column: ");

        column = input.nextInt();

        System.out.print("Enter symbol to use: ");

        symbol = input.next();

        for (int i = 1; i <= rows; i ++ ){

            System.out.println();

            for (int j = 1; j <= column; j++){

                System.out.print(symbol);
            }
        }







    }
}
