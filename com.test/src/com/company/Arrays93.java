package com.company;

import java.util.Arrays;

public class Arrays93 {

    public static void main(String[] args){

        int[] itms = new int[5];

        itms[0] = 10;
        itms[1] = 11;
        itms[2] = 12;
        itms[3] = 13;
        itms[4] = 14;

        System.out.println(itms[0]);
        System.out.println(itms[4]);


        int[] abc ={1,34,3,24,3432,4343,432,432,432,423,432,43,242,34,234,32};
        System.out.println(abc.length);
        System.out.println(Arrays.stream(abc).sum());
        System.out.println(Arrays.toString(abc));



    }
}
