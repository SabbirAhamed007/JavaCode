package com.company;

public class Lugges {


    String name;
    int size;
    String madeIn;

    public Lugges(String name, int size, String madeIn){

        this.name = name;
        this.size = size;
        this.madeIn = madeIn;

    }

    public void setName(String name){

        this.name = name;
    }

    public void setSize(int size){

        this.size = size;
    }

    public void setMadeIn(String madeIn){

        this.madeIn = madeIn;

    }

    public String getName(){

        return name;
    }

    public int getSize(){
        return size;
    }
    public String getMadeIn(){


        return madeIn;
    }


    @Override

    public String toString(){

        return ("Name: "+ this.getName()+", Size: "+ this.getSize()+", Made in: "+this.getMadeIn()+".");
    }

    public static void main(String[] args) {

        Lugges switchBag = new Lugges("Switch Bag", 20, "Switzarland");

        System.out.println(switchBag.name);
        System.out.println(switchBag.size);
        System.out.println(switchBag.madeIn);
    }
}
