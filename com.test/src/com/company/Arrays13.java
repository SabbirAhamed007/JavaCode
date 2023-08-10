package com.company;

import java.util.Arrays;

public class Arrays13 {

    public static void main(String[] args){

        String[][] cars = {{"Toyota", "Honda", "Nissan"},{"Mercedes", "BMW", "Audi"}};

        Arrays.deepToString(cars);
        System.out.println(cars[0][0]);
        System.out.println(cars[0][1]);
        System.out.println(cars[0][2]);
        System.out.println(cars[1][0]);
        System.out.println(cars[1][1]);
        System.out.println(cars[1][2]);

        System.out.println(Arrays.deepToString(cars));


        for(int i = 0; i < cars.length; i++){

            System.out.println();

            for (int j = 0; j < cars[i].length; j++){

                System.out.println(cars[i][j]);
            }
        }

    }
}
