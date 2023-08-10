package com.company;

public class VariableSwap {

    public static void main(String[] args){


        String x = "Water";
        String y = "Vodka";
        String temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println("X: " + x);
        System.out.println("y: " + y);

    }
}
