package com.company;

public class Camera {

    String name;
    int year;
    String model;

    public Camera(String name, int year, String model){

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

    public int getYear(){

        return year;
    }

    public String getModel(){

        return model;
    }

    @Override


    public String toString(){

        return ("Name: " + this.getName() +", Year: "+ this.getYear() +", Model: "+ this.getModel());

    }



    public static void main(String[] args){


        Camera Nikon = new Camera("Nikon", 2020, "D750");

        System.out.println(Nikon.name);

        System.out.println(Nikon.year);

        System.out.println(Nikon.model);
    }


}
