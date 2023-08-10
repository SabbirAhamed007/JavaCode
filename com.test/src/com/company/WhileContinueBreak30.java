package com.company;

import java.util.Scanner;

public class WhileContinueBreak30 {

    public static void main(String[] args){

        Scanner abc = new Scanner(System.in);

        String input = "";

        while (true){

            System.out.print("Please enter anything to try your luck: ");

            input = abc.nextLine().toLowerCase();

            if (input.equals("ahamed"))
                continue;

            if (input.equals("sabbir"))
                break;
            System.out.println(input);




        }
    }
}
