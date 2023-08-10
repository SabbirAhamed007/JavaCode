package com.company;

import java.util.Arrays;

public class Arrays292 {

    public static void main(String[] args){

        int[] nums = new int[5];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;


        System.out.println(nums[1]);

        System.out.println(nums[4] );

        int[] ids = {1,2,3,3,2,2,3,3,2,324343,432,4324,324,324,24,32,4,4,324,46,5765,756,75,54,4,435,34};

        System.out.println(Arrays.toString(ids));
        System.out.println(Arrays.stream(ids).max());
        System.out.println(Arrays.stream(ids).count());



    }
}
