package com.company;

public class NazeerG {

    String name;
    int age;
    String occupation;

    public NazeerG(String name, int age, String occupation){

        this.name = name;

        this.age = age;

        this.occupation = occupation;


    }

    public void setName(String name){

        this.name = name;
    }

    public void setAge(int age){

        this.age = age;
    }

    public void setOccupation(String occupation){

        this.occupation = occupation;
    }

    public String getName(){

        return name;
    }

    public int getAge(){

        return age;
    }

    public String getOccupation(){

        return occupation;
    }

    @Override

    public String toString(){

        return ("Name: " + this.getName() +", Age: " + this.getAge() +", Occupation: " + this.getOccupation());
    }

    public static void main(String[] args){


        NazeerG input = new NazeerG("Nazeer A Golab", 34 , "Tax Collector");

        System.out.println(input.getName());

        System.out.println(input.getAge());

        System.out.println(input.getOccupation());
    }



}
