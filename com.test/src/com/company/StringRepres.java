package com.company;

import java.util.Locale;

public class StringRepres {

    public static void main(String[] args){

        String message = "Sabbir" + " " + " Ahamed";

        System.out.println(message.endsWith("ed"));

        System.out.println(message.length());

        System.out.println(message.toLowerCase());

        System.out.println(message.indexOf('m'));

        System.out.println(message.replace("ed", "de"));

        System.out.println(message.replace("ed", "ed !!!"));

        System.out.println(message.toUpperCase(Locale.ROOT));

        System.out.println(message.trim());


        String mess = "Hello \"Sabbir\"";

        System.out.println(mess);

        String url = "c:\\windows\\my folder\\sabbir.exe";

        System.out.println(url);


    }
}
