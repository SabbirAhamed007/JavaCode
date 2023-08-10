package com.company;

public class Constractor3e {

    String name;
    int year;
    String model;


    public Constractor3e(String name, int year, String model){


        this.name = name;
        this.year = year;
        this.model = model;



    }

    public void setName(String name){

        this.name = name;
    }

    public void setYear(int year){

        this.year = year;
    }

    public void setModel(String model){

        this.model = model;
    }


    public String getName(){

        return name;
    }

    public  int getYear(){

        return year;
    }

    public String getModel(){

        return model;
    }

    @Override

    public String toString(){

        return ("Name : " + name +", Year: " + year +", Model: "+ model + ".");
    }

    public static void main(String[] args){

        Constractor3e input = new Constractor3e("Sam", 2021, "ET345");

        System.out.println(input.name);
        System.out.println(input.year);
        System.out.println(input.model);
    }
}
