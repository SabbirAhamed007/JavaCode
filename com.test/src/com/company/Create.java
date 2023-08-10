package com.company;

public class Create {

    String name;
    String color;
    int size;


    public Create(String name, String color, int size){


        this.name = name;

        this.color = color;

        this.size = size;
    }

    public void setName(String name){


        this.name = name;
    }

    public void setColor(String color){

        this.color = color;
    }

    public void setSize(int size){

        this.size = size;
    }

    public String getName(){

        return name;
    }

    public String getColor(){

        return color;
    }

    public int getSize(){

        return size;
    }


    @Override

    public String toString(){

        return ("Name: " + this.getName() +", Color: "+ this.getColor() +", Size: " + this.getSize());
    }

    public static void main(String[] args){

        Create input = new Create("Create", "Pink", 12);

        System.out.println(input.name);

        System.out.println(input.color);

        System.out.println(input.size);

    }
}
