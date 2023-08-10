package com.company;

public class AccressModi {

    protected String name;
    protected int age;

    public AccressModi(String name, int age){

        this.name = name;
        this.age = age;

    }

    public void setName(String name){
        this.name = name;

    }

    public void setAge(int age){

        this.age = age;
    }

    public String getName(){

        return name;
    }

    public int getAge(){

        return age;
    }

    @Override

    public String toString(){

        return ("Name: " + this.getName() + ", Age: " + this.getAge());
    }
}
