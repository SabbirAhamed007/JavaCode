package com.company;

public class Monitor {

    String name;
    int year;
    String model;

    public Monitor(String name, int year, String model){


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

        return ("Namae is : " + name+", Year: " + year+ ", Model: " + model+".");
    }


    public static void main(String[] args){


        Monitor lg = new Monitor("LG", 2020, "KL32");
        System.out.println(lg.name);
        System.out.println(lg.year);
        System.out.println(lg.model);
    }
}
