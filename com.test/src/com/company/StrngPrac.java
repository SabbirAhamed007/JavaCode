package com.company;

public class StrngPrac {

    public static void main(String[] args){

        String input = "Welcome !!" + "Sabbir";

        System.out.println(input.endsWith("r"));

        System.out.println(input.startsWith("S"));

        System.out.println(input.startsWith("W"));

        System.out.println(input.length());

        System.out.println(input.replace("Sabbir", "Ahamed"));

        System.out.println(input.indexOf("!"));

        System.out.println(input.toLowerCase());


    }
}
