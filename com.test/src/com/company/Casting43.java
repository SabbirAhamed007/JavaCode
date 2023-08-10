package com.company;

public class Casting43 {

    public static void main(String[] args){
        //implicit casting

        // byte >> short >> int >> long
        short x = 3;
        int y = x + 2;
        System.out.println(y);


        double g = 1.2;
        int h = (int)g + 1;
        System.out.println(h);


        String d = "1.2";

        Double f = Double.parseDouble(d) - 1.0;
        System.out.println(f);


        //Integer.parseInt()  //int type
        //Short.parseShort()  // short type
        //Double.parseDouble()   // double type
        //Float.parseFloat()    // float type

        String u = "2.5";

        double i = Double.parseDouble(u) - 2;
        System.out.println(i);







    }
}
