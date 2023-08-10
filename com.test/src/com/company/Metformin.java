package com.company;

public class Metformin {

    String name;

    String strength;

    int expYear;


    public Metformin(String name, String strength, int expYear){


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

    public int getExpYear() {
        return expYear;
    }

    @Override

    public String toString(){


        return ("Name: " + this.getName() + "Strength: " + this.getStrength() + "Expire Year: " + this.getExpYear());


    }


    public static void main(String[] args){

        Metformin tablet = new Metformin("Metformin" , "500MG", 2025);

        System.out.println(tablet.name);
        System.out.println(tablet.strength);
        System.out.println(tablet.expYear);
    }
}
