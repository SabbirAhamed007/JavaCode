package com.company;

import java.util.Scanner;

public class Busket {

    public void myBusket(){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your busket color: ");

        String myBusket = input.nextLine().toLowerCase();

        if (myBusket.equals("red")){

            System.out.println("Red color busket for target.");
        }
        else if(myBusket.equals("blue")){

            System.out.println("Blue is for walmart.");
        }
        else if (myBusket.equals("white")){

            System.out.println("White is for Macy's");
        }

        else

            System.out.println("We can sale anywhere.");
    }
}
