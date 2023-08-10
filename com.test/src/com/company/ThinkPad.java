package com.company;

public class ThinkPad {

    String name;
    float size;
    String model;

    public ThinkPad(String name, float size, String model){

        this.name = name;
        this.size = size;
        this.model = model;


    }

    public void setName(String name){

        this.name = name;
    }

    public void setSize(float size){

        this.size = size;
    }

    public void setModel(String model){

        this.model = model;


    }

    public String getName(){

        return name;
    }

    public float getSize(){

        return size;
    }

    public String getModel(){

        return model;
    }


    @Override
    public String toString(){

        return ("Name: " + this.getName() +", Size: "+ this.getSize() +", Model: "+ this.model);


    }

    public static void main(String[] args){


        ThinkPad lenovo = new ThinkPad("ThinkPad Lenovo" , 15.5F , "AKM340");

        System.out.println(lenovo.name);
        System.out.println(lenovo.size);
        System.out.println(lenovo.model);


    }


}
