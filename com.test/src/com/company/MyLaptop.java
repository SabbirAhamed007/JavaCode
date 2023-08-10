package com.company;

public class MyLaptop {

    String name;
    float size;
    String modelNumber;
    int year;


    public MyLaptop(String name, float size, String modelNumber, int year){

        this.name = name;
        this.size = size;
        this.modelNumber = modelNumber;
        this.year = year;


    }

    public void setName(String name){

        this.name = name;


    }

    public void setSize(float size){

        this.size = size;
    }

    public void setModelNumber(String modelNumber){

        this.modelNumber = modelNumber;

    }

    public void setYear(int year){

        this.year = year;
    }

    public String getName(){

        return name;
    }

    public float getSize(){

        return size;
    }

    public String getModelNumber(){
        return modelNumber;

    }

    public int getYear(){

        return year;
    }

    @Override

    public String toString(){

        return ("Laptop name is: "+ this.getName() +", size is: " + this.getSize() +", model number is: " + this.getModelNumber() + ", release year is: " + this.getYear());



    }

    public static void main(String[] args){

        MyLaptop laptop = new MyLaptop("LG", 13.5F, "E92F2020", 2020);

        System.out.println(laptop.name);
        System.out.println(laptop.size);
        System.out.println(laptop.modelNumber);
        System.out.println(laptop.year);
    }



}
