package com.company;

import java.util.Locale;

public class String3 {

    public static void main(String[] args){

        String message20 = new String("Hi Teams");

        System.out.println(message20);

        String message21 = "Hi Sabbir " + "Distril Water";

        System.out.println(message21);

        String message22 = "Hi Sabbir" + "Male";

        //message22.startsWith("Hi Sabbir");
        System.out.println(message22.startsWith("Hi Sabbir"));

        String message23 = "Cristal" + " Palace";

        System.out.println(message23.endsWith("Palace"));

        String message24 = "12345667";
        System.out.println(message24.replace("1", "E"));


        String message25 = "6";
        System.out.println(message25.compareTo("5"));

        String message30 = "Sabbir " + "Ahamed";
        System.out.println(message30);

        String message31 = "Dan" + "Man";

        System.out.println(message31.startsWith("Dan"));

        String message32 = "Cat";
        System.out.println(message32.replace("C", "B"));


        String message33 = "Sabbir " + "Ahamed";

        System.out.println(message33);

        System.out.println(message33.replace("S", "G"));


        String message34 = "Today is " + "Sunday";

        //System.out.println(message34);

        System.out.println(message34.replace("Sunday", "Monday"));


        String message35 = "Sabbir Ahamed";
        System.out.println(message35.indexOf("m"));

        System.out.println(message35.toLowerCase(Locale.ROOT));


        String message36 = " Sun" + " day    ";
        System.out.println(message36.trim());


    }
}


