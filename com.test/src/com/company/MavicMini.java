package com.company;

public class MavicMini {

    String name;
    String model;
    int year;

    public MavicMini(String name, String model, int year){

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

        return ("Name: " + this.getName() + ", Model: " + this.model + ", Year: " + this.getYear());
    }

    public static void main(String[] args){

        MavicMini pro = new MavicMini("Mavic Mini", "Mini 3 Pro", 2022);

        System.out.println(pro.getName());

        System.out.println(pro.getModel());

        System.out.println(pro.getYear());
    }


}
