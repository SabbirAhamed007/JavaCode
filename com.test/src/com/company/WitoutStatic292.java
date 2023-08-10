package com.company;

import java.util.Scanner;

public class WitoutStatic292 {

    public void main(){

        Scanner inut = new Scanner(System.in);

        System.out.print("Please enter your name: ");

        String myNam = inut.nextLine().toLowerCase();
        System.out.println(myNam);
    }
}
