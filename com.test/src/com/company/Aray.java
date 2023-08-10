package com.company;


import java.util.Arrays;

public class Aray {

    public static void main(String[] args){

        int[] largeNumbers = new int[3];

        largeNumbers[0] = 5;
        largeNumbers[1] = 9;
        largeNumbers[2] =3;


        System.out.println(Arrays.toString(largeNumbers));


        int[] lnum = {1,0,4,5,6};
        System.out.println(lnum.length);

        int[] knums = {7,6,4,3,2,6,7,8,5,6,23,55};

        System.out.println(knums.length);

        int[] bilbow = {7,6,4,3,2,6,7,8,5,6,23,55};

        Arrays.sort(bilbow);
        System.out.println(Arrays.toString(bilbow));


        int[] jakson = {443,5,43,543,5,5,5,3454,35,5,5,5,5,65756,8,87,8,987,9,97,9,6,353,45,34534,53,3};

        Arrays.sort(jakson);

        System.out.println(Arrays.toString(jakson));

        int[] jazz = {4234234,423423,42,3423,432,42,445,43,435,34543,534,645,67,5676,867,86,869,7890890};

        Arrays.sort(jazz);

        System.out.println(Arrays.toString(jazz));


        int[] hhh = {324,445,46,5,657,57,87,87,8,789,879,80,980,980,98,97,54,534,532,543,54,65,23,31,312,31};

        Arrays.sort(hhh);
        System.out.println(Arrays.toString(hhh));




        int[] yyy = new int[5];

        yyy[0] = 1;
        yyy[1] = 7;
        yyy[2] = 2;
        yyy[3] = 3;
        yyy[4] = 5;

        System.out.println(yyy);


        int[] uuu = {32432,432,42,423,4,4,324,32432,432,43,2432,43,2432,432,44,234,32};

        Arrays.sort(uuu);

        System.out.println(Arrays.toString(uuu));




    }
}
