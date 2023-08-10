package com.company;

public class Box {

    String name;
    int size;
    String madeBy;

    public Box(String name, int size, String madeBy){

        this.name = name;

        this.size = size;

        this.madeBy = madeBy;

    }

    public void setName(String name){

        this.name = name;
    }

    public void setSize(int size){

        this.size = size;
    }

    public void setMadeBy(String madeBy){

        this.madeBy = madeBy;

    }

    public String getName(){

        return name;
    }

    public int getSize(){

        return size;
    }

    public String getMadeBy(){

        return madeBy;
    }

    @Override

    public String toString(){


        return ("Box name is: " + name +", Box size is: "+ size +", Box made by: " + madeBy + ".");
    }

    public static void main(String[] args){

        Box douglus = new Box("Douglus", 12, "USA");

        System.out.println(douglus.name);
        System.out.println(douglus.size);
        System.out.println(douglus.madeBy);
    }
}
