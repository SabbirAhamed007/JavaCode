package com.company;

import java.util.Arrays;

public class TwoDimentionalArrays {

    public static void main(String[] args){

        int[][] numbres = new int[2][3];

        numbres[0][0] = 1;
        numbres[1][0] = 2;
        numbres[0][1] = 3;
        numbres[0][2] = 4;
        numbres[1][1] = 5;
        numbres[1][2] = 6;

        System.out.println(Arrays.deepToString(numbres));


        int[][] tet = {{1,2,3}, {4,5,6}};
        System.out.println(Arrays.deepToString(tet));

        //String[][][] student = {{"Sabbir", "kamal", "Jaber"}, {1,2,3}, {"Class 2", "Class 3", "Class 4"}};
        //System.out.println(student);





    }
}
