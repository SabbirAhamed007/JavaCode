package com.company;

public class index {

    public static void main(String[] args){

        String input = "fdsfdsfdsSSDF56";

        System.out.println(input.indexOf("SSD"));
        System.out.println(input.replace("SSD", ""));
        System.out.println(input.replace("SSDF", "SSSS"));

        String abc = "Hello !!! \"Sabbir\"";
        System.out.println(abc.replace("Sabbir", "Ahamed"));

        String tt = "C:\\doc\\mydoc...";
        System.out.println(tt);

        String kk = "C:\nWindows\\abc";
        System.out.println(kk);

        String l = "Sabbir\tAhamed";
        System.out.println(l);
    }
}
