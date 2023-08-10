package com.company;

public class Arrays12 {

    public static void main(String[] args){

        //Arrays = used to store multiple values in a single variables

        String[] cars = {"Toyota", "Mercedes Benz", "Audi"};

        cars[0] = "BMW";

        //System.out.println(cars[1]);

        for (int i = 0; i <cars.length; i++){

            System.out.println(cars[i]);
        }


    }
}
