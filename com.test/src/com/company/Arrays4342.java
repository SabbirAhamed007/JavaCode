package com.company;

import java.util.Arrays;

public class Arrays4342 {

    public static void main(String[] args){

        int[] input = new int[5];
        input[0] = 1;
        input[1] = 2;
        input[2] = 3;
        input[3] = 4;
        input[4] = 5;
        System.out.println(input[1]);

        float[] numbres = {2.3F,4,5,4,24,324,324,34,324,324,32432,43,2432,432,42,34,324,324,325.6F, 5.6F};

        Arrays.sort(numbres);


        System.out.println(Arrays.toString(numbres));

        System.out.println(numbres.length);


        int[][] inputo = new int[2][3];
        inputo[0][0] = 1;
        inputo[0][1] = 2;
        inputo[0][2] = 3;
        inputo[1][0] = 4;
        inputo[1][1] = 5;
        inputo[1][2] = 6;

        System.out.println(Arrays.deepToString(inputo));







    }
}
