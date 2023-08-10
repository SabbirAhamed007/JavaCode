package com.company;

import java.util.Scanner;

public class TenaryOporator432432 {

    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your meritail status: ");

        String myInput = input.nextLine().toLowerCase();

        String abc = myInput.equals("single")? "S" : "M";

        System.out.println(abc);


    }
}
