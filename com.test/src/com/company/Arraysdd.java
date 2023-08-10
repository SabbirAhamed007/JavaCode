package com.company;

import java.util.Arrays;

public class Arraysdd {

    public static void main(String[] args){

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        int[][] nums = new int[2][3];

        nums[0][0] = 1;
        nums[1][0] = 2;
        nums[0][1] = 3;
        nums[0][2] = 4;
        nums[1][1] = 5;
        nums[1][2] = 6;



        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.deepToString(nums));

        int[] tt = {1,2,3,3,3,4,34,324,32432,432,432,423,32,432,432,432,432,42356,57,5,545,6};

        System.out.println(tt.length);

        System.out.println(Arrays.toString(tt));

        int[] rr = {43,34,4,3,534543,56,8,876,8,899,0,98,01,76453,523,2,23,24,36,5467,658,9,8,5653,24,23,213,123};

        Arrays.sort(rr);

        System.out.println("Sort Arrays are: "+ Arrays.toString(rr));


        int[] myList = {424,4,324,324,324,324,5,43654,76,57,657,56,87,7,7,564,352,4,457,879,987,8,76543,23,21,321,321};

        Arrays.sort(myList);

        System.out.println(Arrays.toString(myList));





    }
}
