package com.company;

public class SUV {

    String name;
    String model;
    int year;

    public SUV(String name, String model, int year){

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

        return ("Name: " + this.getName() +", Model: "+ this.getModel() +", Year: "+ this.getYear());
    }


    public static void main(String[] args){

        SUV acura = new SUV("Acura", "Mdx", 2020);

        System.out.println(acura.name);

        System.out.println(acura.model);

        System.out.println(acura.year);
    }
}
