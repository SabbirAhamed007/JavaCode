package com.company;

import java.util.Arrays;

public class MultipleArrays34 {

    public static void main(String[] args){


        int[][] input = new int[2][1];

        input[0][0] = 1;
        input[1][0] = 2;



        System.out.println(Arrays.deepToString(input));



        int[][] input1 = {{12,3,4}, {45,21,11}, {34,7,98}};

        System.out.println(Arrays.deepToString(input1));


    }
}
