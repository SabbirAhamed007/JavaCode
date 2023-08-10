package com.company;

public class Diltiazem {

    String name;
    int mg;
    String madeBy;


    public Diltiazem(String name, int mg, String madeBy){

        this.name = name;
        this.mg = mg;
        this.madeBy = madeBy;


    }

    public void setName(String name){

        this.name = name;
    }

    public void setMg(int mg){

        this.mg = mg;
    }

    public void setMadeBy(String madeBy){

        this.madeBy = madeBy;
    }

    public String getName(){

        return name;
    }

    public int getMg(){

        return mg;
    }

    public String getMadeBy(){

        return madeBy;
    }

    @Override

    public String toString(){

        return ("Name: " + this.getName() +", Mg: " + this.getMg() +", Madein: " + this.getMadeBy()+".");


    }

    public static void main(String[] args){

        Diltiazem tab = new Diltiazem("Diltiazem", 2, "US");

        System.out.println(tab.name);
        System.out.println(tab.mg);
        System.out.println(tab.madeBy);


    }
}
