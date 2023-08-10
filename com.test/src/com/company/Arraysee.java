package com.company;

import java.util.Arrays;

public class Arraysee {

    public static void main(String[] args){

        String[] student = new String[500];
        student[0] = "Sabbir";
        student[1] = "Kabir";
        student[2] = "Mofiz";
        student[3] = "Klanti";

        System.out.println(student[1].replace("Kabir", "Jamal"));
        System.out.println(student[400]);

        System.out.println(Arrays.toString(student));


        int[] studentRoll = {1,2,3,4,5,6,7,83,432423,4,423,4,423,432,42,424,324,32432,432,432,423,432,432,432,432,};

        Arrays.sort(studentRoll);
        System.out.println(Arrays.toString(studentRoll));







    }
}
