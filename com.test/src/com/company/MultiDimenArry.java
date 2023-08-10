package com.company;

import java.util.Arrays;

public class MultiDimenArry {

    public static void main(String[] args){
        //this is single dimentional Arrays
        int[] numbers = new int[6];

        numbers[0] = 4;
        numbers[1] =2;
        numbers[2] =6;
        numbers[3] =7;
        numbers[4] =8;
        numbers[5] =10;


        System.out.println(numbers);


        //two dimentional Arrays

        int[][] nums = new int[2][3];

        nums[0][0] =3;
        nums[1][0] = 5;
        nums[0][1] = 6;
        nums[0][2] = 7;
        nums[1][1] = 8;
        nums[1][2] = 55;


        System.out.println(Arrays.deepToString(nums));


        int[][] num22 = {{2,3,4}, {4,5,6}};
        System.out.println(Arrays.deepToString(num22));


        int [][] iii= {{23,34,45,45,45,45}, {43,65,6,5,6,5}};
        System.out.println(Arrays.deepToString(iii));


        //So what we learn from here,

        //One dimentional Arrays


        int[] ss = {4,3,35,435,4354,5,54,35,345,345,435,435,345,35};
        System.out.println(Arrays.toString(ss));


        //two dimentional Arrays

        int[][] oo = {{34,324,242,}, {4,234,234}};

        System.out.println(Arrays.deepToString(oo));




        int[][] abc = new int[2][4];
        abc[0][0] = 2;
        abc[0][1] = 6;
        abc[0][2] = 7;
        abc[0][3] = 8;
        abc[1][0] = 6;
        abc[1][1] = 33;
        abc[1][2] = 22;
        abc[1][3] = 23;

        System.out.println(Arrays.deepToString(abc));


        int[][] nums44 = {{4,432,4,3243,43,43,432,4}, {42,3423,432,4324,324,324,5}};

        System.out.println(Arrays.deepToString(nums44));





    }
}
