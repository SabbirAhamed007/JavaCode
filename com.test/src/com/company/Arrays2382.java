package com.company;

import java.util.Arrays;

public class Arrays2382 {

    public static void main(String[] args){


        int[] number = new int[3];

        number[0] = 4;
        number[1] = 7;
        number[2] = 9;

        System.out.println(Arrays.toString(number));


        float[] num = {3.5F, 5.6F};
        System.out.println(Arrays.toString(num));

        int[] myNum = {4324,324,324,32,432,432,432,432,43,24,324,324,23,432,432,432,4,32};

        System.out.println(myNum.length);

        Arrays.sort(myNum);

        System.out.println(Arrays.toString(myNum));


        int[][] diNum = {{2,3,4,54},{7,4,2}, {76,44,12}};

        System.out.println(Arrays.deepToString(diNum));


    }
}
