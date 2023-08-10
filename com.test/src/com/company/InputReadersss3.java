package com.company;

import java.util.Scanner;

public class InputReadersss3 {
    public static void main (String[] args){

        Scanner s = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String gg = s.nextLine();
        System.out.println("Name: " + gg);

        Scanner jj = new Scanner(System.in);
        System.out.print("Roll: ");
        byte k = jj.nextByte();
        System.out.println("Roll: " + k);

        Scanner oo = new Scanner(System.in);
        System.out.print("Group: ");
        String g = oo.nextLine().trim();
        System.out.println("Group: " + g);



    }
}
