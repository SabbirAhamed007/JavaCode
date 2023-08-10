package com.company;

public class LagerLight {

    String name;
    String model;
    int year;

    public LagerLight(String name, String model, int year){

        this.name = name;
        this.model = model;
        this.year = year;

    }

    public void setName(String name){

        this.name = name;
    }

    public void setModel(String model){

        this.model = model;
    }

    public void setYear(int year){

        this.year = year;
    }

    public String getName(){

        return name;
    }

    public String getModel(){

        return model;
    }

    public int getYear(){

        return year;
    }

    @Override

    public String toString(){


        return ("Name: " + this.getName() +", Model: " + this.getModel() +", Exp Year: "+ this.getYear());
    }

    public static void main(String[] args){

        LagerLight multicolor = new LagerLight("Laxer Laser", "LL5051" , 2023);


        System.out.println(multicolor.name);

        System.out.println(multicolor.model);

        System.out.println(multicolor.year);

    }
}
