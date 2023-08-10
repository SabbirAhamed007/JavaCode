package com.company;

import java.util.Arrays;

public class Arrays40 {

    public static void main(String[] args){

        int[] num = new int[5];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;

        System.out.println(Arrays.toString(num));

        float[] abe = {3,5,5,2.4f,4.43f,34,324324.3f,7};
        System.out.println(abe.length);
//        Arrays.deepToString(abe);
//        System.out.println(abe);

        int[][] ii = new int[4][6];
        ii[0][0] = 0;
        ii[0][1] = 1;
        ii[0][2] = 2;
        ii[0][3] = 3;

        System.out.println(Arrays.deepToString(ii));


        int[][] op = {{2,3}, {4,6}};

        System.out.println(Arrays.deepToString(op));



    }
}
