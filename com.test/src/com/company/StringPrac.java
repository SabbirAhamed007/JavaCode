package com.company;

public class StringPrac {

    public static void main(String[] args){

        String mesage = "Hi Sabbir !!! " + "Good Afternoon";

        mesage.endsWith("n");

        mesage.toUpperCase();

        System.out.println(mesage);

        String newMessage = mesage.replace("Afternoon", "Night");
        System.out.println(newMessage);

        String ii = "SJdskldkas7887";


        System.out.println(ii.endsWith("87"));
        System.out.println(ii.startsWith("78"));



    }
}
