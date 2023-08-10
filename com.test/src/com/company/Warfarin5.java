package com.company;

public class Warfarin5 {

    String name;
    String strength;
    int expYear;

    public Warfarin5(String name, String strength, int expYear){

        this.name = name;

        this.strength = strength;

        this.expYear = expYear;

    }

    public void setName(String name){

        this.name = name;
    }

    public void setStrength(String strength){

        this.strength = strength;
    }

    public void setExpYear(int expYear){

        this.expYear = expYear;
    }

    public String getName(){

        return name;
    }

    public String getStrength(){

        return strength;
    }

    public int getExpYear(){

        return expYear;
    }


    @Override
    public String toString(){


        return ("Name: " + this.getName() +", Strength: "+ this.getStrength() +", Expire Year: "+ this.getExpYear());


    }

    public static void main(String[] args){

        Warfarin5 warfarin = new Warfarin5("Warfarin", "5mg", 2024);

        System.out.println(warfarin.name);
        System.out.println(warfarin.strength);
        System.out.println(warfarin.expYear);

    }
}
