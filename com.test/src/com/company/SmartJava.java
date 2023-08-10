package com.company;

public class SmartJava {

    public static void main(String[] args){

        String input = "Sddfdffdfsdf";

        char looking = 's';

        int count = 0;

        int findCharLength = input.length();

        for (int i = 0; i < input.length(); i++){

            if (input.charAt(i) == looking){

                count++;
            }
        }

        System.out.println(input);






    }
}
