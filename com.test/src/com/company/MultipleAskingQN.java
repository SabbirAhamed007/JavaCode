package com.company;

import java.util.Scanner;

public class MultipleAskingQN {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");

        String name = scanner.nextLine().toLowerCase();

        System.out.print("Please enter address: ");

        String address = scanner.nextLine().toLowerCase();
        //scanner.nextLine().toLowerCase();

        System.out.print("Please enter your class: ");

        int classStd = scanner.nextInt();

        System.out.print("Please enter your roll number: ");
        //scanner.nextInt();

        int roll = scanner.nextInt();

        System.out.println(name);
        System.out.println(address);
        System.out.println(classStd);
        System.out.println(roll);



    }
}
