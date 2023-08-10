package com.company;

public class Madonna {

    String name;
    int age;
    String profession;


    public Madonna(String name, int age, String profession){


        this.name = name;
        this.age = age;
        this.profession = profession;


    }

    public static void main(String[] args){


        Madonna inout = new Madonna("Madonna", 56, "Singer");

        System.out.println(inout.name);
        System.out.println(inout.age);
        System.out.println(inout.profession);
    }
}
