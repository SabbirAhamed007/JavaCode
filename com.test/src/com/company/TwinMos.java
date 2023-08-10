package com.company;

public class TwinMos {

    String name;

    int size;

    String year;


    public TwinMos(String name, int size, String year){

        this.name = name;

        this.size = size;

        this.year = year;

    }

    public void setName(String name){

        this.name = name;
    }

    public void setSize(int size){

        this.size = size;
    }

    public void setYear(String year){

        this.year = year;
    }

    public String getName(){

        return name;
    }

    public int getSize(){

        return size;
    }


    public String getYear(){

        return year;
    }


    @Override

    public String toString(){


        return ("Name: " + name +", MB: "+ size +", Year: "+ year);
    }


    public static void main(String[] args){


        TwinMos memorey = new TwinMos("TwinMos", 400, "2020");

        System.out.println( memorey.name);

        System.out.println(memorey.size);

        System.out.println(memorey.year);




    }

}
