package com.company;

public class StringLitaral34 {

    public static void main(String[] args){


        String mesage = "Sabbir:#$%^#$123";


        String abc = mesage.replace("#$%^#", "").toUpperCase();

        String cba = ", Jaber:$578";

        System.out.println(abc);

        System.out.println(abc + cba.toUpperCase());

        System.out.println(cba.startsWith(", Jaber"));

        System.out.println(abc.length() + cba.toUpperCase().length());
        System.out.println(abc.indexOf(3) + cba.indexOf(8));
    }
}
