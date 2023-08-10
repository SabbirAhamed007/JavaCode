package com.company;

import java.util.Scanner;

public class ComparisonOperators {

    public static void main(String[] args){

        int x = 3;
        int y = 3;
        System.out.println(x == y);

        int g = 5;
        int h = 5;
        System.out.println(g != h);

        int e = 6;
        int r = 6;
        System.out.println(e >= r);

        int q = 6;
        int w = 5;
        System.out.println(q <= w);
        System.out.println(q == w);


        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter today's temperature: ");

        int temperature = scanner.nextInt();
        boolean isWorm = temperature >= 20 && temperature <= 30;
        System.out.println(isWorm);




    }
}
