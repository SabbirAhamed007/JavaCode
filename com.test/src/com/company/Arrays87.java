package com.company;

import java.util.Arrays;

public class Arrays87 {

    public static void main(String[] args){


        int[] number = new int[5];

        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        number[3] = 4;
        number[4] = 5;
        System.out.println(number[3]);
        System.out.println(Arrays.toString(number));

        int[][] myNum = {{2,3,4},{4,7,1}};



        System.out.println(Arrays.deepToString(myNum));


        int[] iop = {4,7,1,34,2};
        Arrays.sort(iop);

        System.out.println(Arrays.toString(iop));





    }
}
