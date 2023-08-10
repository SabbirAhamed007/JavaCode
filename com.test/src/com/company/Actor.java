package com.company;

public class Actor {

    String name ;
    int age;
    String gender;
    String country;


    public Actor(String name, int age, String gender, String country){

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.country = country;

    }


    public void setName(String name){


        this.name = name;
    }

    public void setAge(int age){


        this.age = age;
    }

    public  void setGender(String gender){

        this.gender = gender;

    }

    public  void setCountry(String country){

        this.country = country;

    }


    public String getName(){

        return name;
    }

    public int getAge(){

        return age;
    }

    public String getGender(){

        return gender;
    }

    public  String getCountry(){

        return country;
    }

    @Override

    public String toString(){

        return ("Actor's Name: "+ this.getName() +", Age: "+ this.getAge() +", Gender: "+ this.gender + ", Country: "+ this.country+".");
    }

    public static void main(String[] args){

        Actor tom = new Actor("Tom Crouse",49, "M", "USA");

        System.out.println(tom.toString());
    }




}
