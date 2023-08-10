package com.company;

import java.util.Random;

public class RandomValues {

    public static void main(String[] args){

        Random randomNumber = new Random();

        int x = randomNumber.nextInt(6) + 1;

        double y = randomNumber.nextDouble();

        boolean z = randomNumber.nextBoolean();

        System.out.println(x);

        System.out.println(y);

        System.out.println(z);


    }
}
