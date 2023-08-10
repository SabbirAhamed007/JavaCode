package com.company;

import java.util.Scanner;

public class LogicalOpration999 {

    public static void main(String[] args){

        int Mercedes = 1;
        int BMW = 2;
        int Audi = 3;

        System.out.print("Please select 1 for Mercedes, 2 for BMW or 3 for Audi: ");

        Scanner carToDrive = new Scanner(System.in);
        int specificModelCar = carToDrive.nextInt();

        if (specificModelCar == 1){

            System.out.println("You have select Mercedes Benz. It has 30 liter gas. You can drive 300 miles for the next gas station.");



        if (specificModelCar == 2)
            System.out.println("This is BMW. It has 29 liter gas. Able to drive 270 miles for a single refill.");


        if (specificModelCar == 3)

            System.out.println("This Audi is unstoppable. Very fast and mind blowing.");
        }

        else
            System.out.println("Please select the correct information.");





    }
}
