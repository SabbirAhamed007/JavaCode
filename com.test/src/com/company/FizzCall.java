package com.company;

public class FizzCall extends FizzBuzz357{

    public static void FizzBuzz357(Integer myNumber){


        if (myNumber % 5 == 0 && myNumber % 3 == 0)
            System.out.println("FizzBuzz");

        else if (myNumber % 5 == 0)
            System.out.println("Fizz");

        else if (myNumber % 3 ==0 )
            System.out.println("Buzz");

        else

            System.out.println("Please try again.");
    }
}
