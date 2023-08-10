package com.company;

import java.util.Scanner;

public class Temperature99 {

    public static void main(String[] args){


        Scanner temp = new Scanner(System.in);
        System.out.print("Please enter current temparature: ");
        int tempNow = temp.nextInt();

        if (tempNow >= 20 && tempNow <= 30 ){

            System.out.println("Nice outside.");
        }

        else if(tempNow >= 31){

            System.out.println("It's a hot weather, please drink planty of water.");
        }

        else if (tempNow <= 19){

            System.out.println("It's cold outside, take jacket.");
        }

        else

            System.out.println("I am not sure please check weather advisory.");
    }
}
