package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class WhileLoopsdsfds {

    public static void main(String[] args){

        Scanner myInput = new Scanner(System.in);

        String inout = "";

        while (true){

            System.out.print("Please enter your prefered car color: ");

            inout = myInput.nextLine().toLowerCase();

            if (inout.equals("red"))

                System.out.println("Nice color. Woman likes it.");

            else if (inout.equals("black"))

                System.out.println("Black is a common color.");

            else if (inout.equals("blue"))

                System.out.println("Man likes it.");

            else if (inout.equals("white"))

                System.out.println("Official color.");

            else

                if (inout.equals("please asked me the question again"))
                    continue;

                if (inout.equals("i am not sure."))
                    break;

            System.out.println(inout);


        }
    }
}
