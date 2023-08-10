package com.company;

public class String1 {

    public static void main (String[] args){

        String message = new String("Hi Sabbir !!!");


        String message2 = "Hi Sabbir";

        System.out.println(message2);


        String message3 = "Hi Sabbir" + "!!!";
        System.out.println(message3);



        String message5 = "Today is" + "Monday";
        //message5.startsWith("Today is");
        System.out.println(message5.startsWith("Today is"));

        String message6 = "Hi Team" + "I am Sabbir";
        //message6.endsWith("I am Sabbir");

        System.out.println(message6.startsWith("I am Sabbir"));

        String message7 = "Hi Sabbir !!!";

        //message7.length();

        System.out.println(message7.length());


        String message8 = "Sabbir" + "Ahamed";

        //message8.length();

        System.out.println(message8.length());

        String message9 = "Sabbir Ahamed";

        System.out.println(message9.indexOf("e"));

        String message11 = "Today is Sonday";
        System.out.println(message11.replace("S", "M"));




    }
}
