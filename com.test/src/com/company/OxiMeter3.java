package com.company;

public class OxiMeter3 {

    String name;
    int year;
    String modelNUmber;

    public OxiMeter3(String name, int year, String modelNUmber){

        this.name = name;
        this.year = year;
        this.modelNUmber = modelNUmber;
    }

    public void setName(String name){

        this.name = name;
    }

    public void setYear(int year){

        this.year = year;
    }

    public void setModelNUmber(String modelNUmber){

        this.modelNUmber = modelNUmber;
    }

    public String getName(){

        return name;
    }

    public int getYear(){

        return year;
    }

    public String getModelNUmber(){

        return modelNUmber;
    }

    @Override

    public String toString(){

        return ("Name is: " + name +", Year: "+ year +", Model: "+ modelNUmber + ".");
    }

    public static void main(String[] args){

        OxiMeter3 maxi = new OxiMeter3("Maxi 90", 2023, "YkZ 745");

        System.out.println(maxi.name);
        System.out.println(maxi.year);
        System.out.println(maxi.modelNUmber);
    }
}
