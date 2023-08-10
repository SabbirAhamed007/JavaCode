package com.company;

public class Arrays {


    public static void main(String[] args){

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        //numbers[10] = 4;

        System.out.println(numbers);


        int[] nums = new int[6];
        nums[0] = 4;
        nums[1] = 5;
        nums[2] = 7;
        nums[3] = 8;
        nums[4] = 9;
        nums[5] = 2;


        int[] num1 = new int[3];

        num1[1] = 1;
        num1[2] = 3;
        num1[0] = 7;
        System.out.println(num1);


        int[] numd = new int[4];

        numd[0] = 1;
        numd[1] = 2;
        numd[2] = 3;
        numd[3] = 4;


        System.out.println(java.util.Arrays.stream(numd).count());
        System.out.println(numd.length);
        System.out.println(numd[1]);
        System.out.println(numd[3]);
        System.out.println(java.util.Arrays.stream(numd).sum());
        System.out.println(java.util.Arrays.stream(numd).max());


        int[] jjj = {3,123,123,213,2132,1321,32,313,213,123,213,213,214,32,432,4324,324,324,324,44};

        java.util.Arrays.stream(jjj).count();
        System.out.println(jjj);

        System.out.println(jjj.length);

        System.out.println(jjj[4]);




    }
}
