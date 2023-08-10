package com.company;

import java.util.Date;

public class ReferenceTypes21 {

    public static void main(String[] args){

        int age = 45;
        Date now = new Date();
        System.out.println(now);


        String student = new String("Sabbir, Zaber, Pavel");
        student.toLowerCase();

        System.out.println(student.length());

        System.out.println(student.indexOf("Z"));
        System.out.println(student.indexOf("Helel"));
        System.out.println(student.replace("a", "y"));

        String doctors = new String(" Sam, John, Labonno.");
        System.out.println(doctors.toLowerCase());

        System.out.println(doctors.replace("Sam", "Dan"));

        System.out.println(doctors.indexOf("S"));

        System.out.println(doctors.replace(".", "!!!"));

        System.out.println(doctors.startsWith("S"));

        System.out.println(doctors.trim());


    }
}
