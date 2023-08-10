package com.company;

public class CastingOne {

    public static void main (String[] args){
        //Implicit casting , means automatic convert to bigger type
        short x = 1;
        int y = x + 2;
        System.out.println(y);

        //but for double

        double c = 42434.34;
        double d = c + 43242.44;
        System.out.println(d);

        // but if we want lower

        double j = 45.34;
        int l = (int)j + 4;
        System.out.println(l);




    }
}
