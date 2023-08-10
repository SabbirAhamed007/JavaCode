package com.company;

import java.util.Scanner;

public class MyCar {

    public static void ferrari2(){

        Scanner engine = new Scanner(System.in);

        System.out.print("Please enter your car engine type: ");

        String myEng = engine.nextLine().toLowerCase();

        if (myEng.equals("v6")){

            System.out.println("It's a v6 engine. Cost $5000.");
        }

        else if (myEng.equals("v8")){


            System.out.println("It's a v8 engine. cost $8000.");
        }

        else
            System.out.println("I dont know. I have to see your car.");



    }
}
