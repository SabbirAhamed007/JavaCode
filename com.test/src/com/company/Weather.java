package com.company;

import java.util.Scanner;

public class Weather {

    public static void CWeather(){

        Scanner weatherNow = new Scanner(System.in);

        System.out.print("Please enter current temparature: ");

        float temp = weatherNow.nextFloat();
        System.out.println(temp);

    }
}
