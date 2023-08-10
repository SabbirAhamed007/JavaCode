package com.company;

public class SmartWatch {

    String name;
    String model;
    int size;
    String color;


    public SmartWatch(String name, String model, int size, String color){


        this.name = name;
        this.model = model;
        this.size = size;
        this.color = color;


    }

    public void setName(String name){

        this.name = name;
    }

    public void setModel(String model){

        this.model = model;
    }

    public void setSize(int size){

        this.size = size;
    }

    public void setColor(String color){

        this.color = color;
    }

    public String getName(){

        return name;
    }

    public String getModel(){

        return model;
    }

    public int getSize(){

        return size;
    }

    public String getColor(){

        return color;
    }


    @Override

    public String toString(){

        return ("Name: " + this.getName() +", Model: "+ this.getModel() +", Size: "+ size +", Color: "+ this.getColor()+ ".");
    }


    public static void main(String[] args){

        SmartWatch iWatch = new SmartWatch("Apple Watch", "iWatch 7", 37, "Pink");

        System.out.println(iWatch.name);
        System.out.println(iWatch.model);
        System.out.println(iWatch.size);
        System.out.println(iWatch.color);

    }
}
