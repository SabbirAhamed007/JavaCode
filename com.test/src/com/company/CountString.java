package com.company;

public class CountString {

    public static void main(String[] args){


        String input = "Sdsjsfsdfjdsf";

        char toCheck = 's';

        int count = 0;

        for (char ch : input.toCharArray()){


            if (ch == toCheck){

                count++;
            }
        }

        System.out.println(count);
    }


}
