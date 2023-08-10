package com.company;

import java.util.Scanner;

public class BreakContinue {

    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);

        String input = "";

        while (!input.equals("sabbir")){

            System.out.print("Please enter anything: ");

            input = scanner.nextLine().toLowerCase();

            //if (!input.equals("sabbir"))

            if (input.equals("pass"))
                continue;

            if (input.equals("sabbir"))
                break;

            System.out.println(input);
        }


    }
}
