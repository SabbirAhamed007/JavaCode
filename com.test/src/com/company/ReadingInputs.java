package com.company;

import java.util.Locale;
import java.util.Scanner;

public class ReadingInputs {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        byte age = scanner.nextByte();
        System.out.println("You are " + age);


        Scanner san = new Scanner(System.in);
        byte bba = san.nextByte();
        System.out.println(bba);


        Scanner nyu = new Scanner(System.in);
        byte ggg = nyu.nextByte();
        System.out.println("Your ID: " + ggg);

        Scanner Temp = new Scanner(System.in);
        float temp = Temp.nextFloat();
        System.out.println("Now the temparsture is : " + temp);

        Scanner yyy = new Scanner(System.in);
        double abd = yyy.nextDouble();
        System.out.println("Please type bank acc number: " + abd);

        Scanner abc = new Scanner(System.in);
        short ttu = abc.nextShort();
        System.out.println("Please print: "+ ttu);

        Scanner www = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        float age1 = www.nextFloat();
        System.out.println(age1);

        Scanner qwq = new Scanner(System.in);
        System.out.println("Please do something: ");
        String abe = qwq.nextLine();
        System.out.println(abe);

        Scanner nam = new Scanner(System.in);
        System.out.println("Please enter your full name: ");
        String num = nam.nextLine();
        System.out.println("Your full name is: " + num);

        Scanner man = new Scanner(System.in);
        System.out.print("Please type address: ");
        String abb = man.nextLine();
        System.out.println("Address: " + abb);


        Scanner cvt = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String rrt = cvt.nextLine();
        System.out.println(rrt);

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Please enter any number: ");
        float sab = scanner1.nextFloat();

        System.out.println("Your magical number is: " + sab );


        Scanner jjt = new Scanner(System.in);

        System.out.print("Please enter your full name: ");

        String abcd = jjt.nextLine().trim();

        System.out.println("Your full name is:" + abcd);


    }
}
