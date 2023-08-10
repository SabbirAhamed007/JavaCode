package com.company;

import java.util.Arrays;

public class Arrays233 {

    public static void main(String[] args){

        String[][] name = {{"Sabbir", "Pavel", "Jaber"},{"Jebun", "Ronok", "Swathi"}};

        Arrays.toString(name);
        System.out.println(name[0][0]);
        System.out.println(name[0][1]);
        System.out.println(name[0][2]);
        System.out.println(name[1][0]);
        System.out.println(name[1][1]);
        System.out.println(name[1][2]);

        System.out.println(Arrays.deepToString(name));

        for (int i = 0; i < name.length; i++){


            System.out.println();

            for (int j = 0; j < name[1].length; j++){

                System.out.println(name[i][j]);
            }
        }


    }
}
