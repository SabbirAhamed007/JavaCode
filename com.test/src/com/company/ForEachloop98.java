package com.company;

import java.util.Scanner;

public class ForEachloop98 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter weather condition: ");

        String weatherNow = input.nextLine().toLowerCase();

        for (int i = 0; i < weatherNow.length(); i++){

            if (weatherNow.equals("cold")){

                System.out.println("Take your jacket, cold outside.");
            }

            else if (weatherNow.equals("hot")){

                System.out.println("Hot day , Drink Planty of water.");
            }

            else if (weatherNow.equals("")){

                System.out.println("Please enter weather condition: ");

                continue;



            }






        }
    }
}
