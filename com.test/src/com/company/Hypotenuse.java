package com.company;

import java.util.Scanner;

public class Hypotenuse {

    public static void main(String[] args){

        double x;
        double y;
        double z;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the value of x: ");

        x = input.nextDouble();

        System.out.print("Please enter the value of y: ");

        y = input.nextDouble();

        z = Math.sqrt((x * x) + (y * y));
        System.out.println("The hypotenuse is: " +z);

        input.close();







    }
}
