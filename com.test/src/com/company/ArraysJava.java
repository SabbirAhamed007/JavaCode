package com.company;

import java.util.Arrays;

public class ArraysJava {

    public static void main(String[] args) {

        int[] any = new int[5];

        any[0]= 1;
        any[1] = 2;
        any[2] = 3;
        any[3] = 4;
        any[4] = 5;



        System.out.println(Arrays.toString(any));
        System.out.println(Arrays.toString(any));

        int[] kk = {2,3,4};
        System.out.println(kk);
        System.out.println(kk.length);



        System.out.println(Arrays.stream(kk).sum());

        int[] sorts = {2,232,32,32,4324,35,35,46,876,87,9879,6786,543,22,42,4567,9,879,876,54,56,7980,8,97685,54,33,4535,6,4542};
        Arrays.sort(sorts);
        System.out.println(Arrays.toString(sorts));



    }





}
