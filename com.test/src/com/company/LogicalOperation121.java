package com.company;

import java.util.Scanner;

public class LogicalOperation121 {

    public static void main(String[] args){

        int temperature = 23;
        boolean isWarm = temperature > 20 && temperature < 30 ;
        System.out.println(isWarm);


        Scanner temp = new Scanner(System.in);
        System.out.print("Please enter today's temperature: ");

        int todayTemp = temp.nextInt();

        boolean isNice = todayTemp >= 20 && todayTemp <= 30;
        System.out.println(isNice);


        Scanner ExamMarks = new Scanner(System.in);
        System.out.print("Please enter your exam marks: ");
        float myMarks = ExamMarks.nextFloat();

        float lowestMark = 40;
        float highestMark = 100;

        boolean passFail = myMarks <= lowestMark && myMarks <= 100;

        System.out.println(passFail);


        Scanner carColor = new Scanner(System.in);

        System.out.print("Please enter your car color: ");
        String myCarColor = carColor.nextLine();

        String colorOne = "red";
        String colorTwo = "white";

        boolean niceColor = myCarColor == colorOne || myCarColor == colorTwo;

        if (niceColor == true){

            System.out.println("I like your car's color.");
        }

        else{

            System.out.println("I don't like your car's caolor.");
        }



        int test = 34;

        boolean testPass = test == 34;
        System.out.println(testPass);







    }
}
