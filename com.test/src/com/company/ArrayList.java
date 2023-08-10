package com.company;

import java.util.Arrays;

public class ArrayList {

    public static void main(String[] args){


        int[] input = {1, 2,5,5,5,5,5,5,54,34,3,324,324,324,53,543,543,5435,435,43,543,543};

        long myInput = Arrays.stream(input).count();

        System.out.println(myInput);

        int abc = Arrays.stream(input).sum();
        System.out.println(abc);

        System.out.println(Arrays.stream(input).max());

        if (input.equals("543")){

            System.out.println("True");
        }


        String[] stdent = {"Sabbir", "Mofiz", "Korim"};

        System.out.println(stdent.equals("Sabbir"));


        String[] nam = new String[100];

        nam[0] = "Sabbir";
        nam[1] = "Karim";
        nam[2] = "Rahim";

        System.out.println(nam[0].replace("Sabbir", "Karim"));

        System.out.println(Arrays.toString(nam));


        int[] dd = {1,32,32,321,32,13,213,123,21,321,321,32,13,213,213};

        Arrays.sort(dd);

        System.out.println(Arrays.toString(dd));

        String dt = "fsdfdsSD43432DSDS###";

        String kk = dt.replace("D43432", "");
        System.out.println(kk);








    }
}
