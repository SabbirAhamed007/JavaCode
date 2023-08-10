package com.company;

import java.util.Scanner;

public class Casting444 {

    public static void main(String[] args){

        // implicit casting
        //byte > short > int > long
        short x = 5;
        int y = x + 4;
        System.out.println(y);




        double vv = 12.45;

        double oo = vv + 10;
        System.out.println(oo);

        //Explicit casting

        double bb = 23.45;

        int cc = (int)bb + 2;

        System.out.println(cc);


        String input = "1";

        int yp = Integer.parseInt(input) + 10;

        System.out.println(yp);


        String rrp = "1.34";

        double qqqp = Double.parseDouble(rrp) + 1222.3333;

        System.out.println(qqqp);

        Scanner myInput = new Scanner(System.in);

        System.out.print("Please enter you like : ");

        String www = myInput.nextLine();

        double kkk = Double.parseDouble(www) + 23.342432;

        System.out.println(kkk);








    }
}
