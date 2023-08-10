package com.company;

import java.util.Scanner;

public class WithoutStatic54 {

    public void main(){


        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");

        String myNam = input.nextLine().toLowerCase();


        System.out.println(myNam);

    }
}
