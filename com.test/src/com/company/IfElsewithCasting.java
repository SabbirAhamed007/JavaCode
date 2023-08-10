package com.company;

import java.util.Scanner;

public class IfElsewithCasting {

    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        System.out.print("Please enter temparature: ");

        String myInput = "";

        myInput = input.nextLine().toLowerCase();


        float myInput1 = Float.parseFloat(myInput);

        if (myInput1 == 20 && myInput1 > 20){

            System.out.println("It's hot today. Please drink planty of water.");



        }

        else if (myInput1 < 20 && myInput1 > 17 ){


            System.out.println("It's nice outside.");
        }

        else


            System.out.println("It is cold today.");



    }



}



