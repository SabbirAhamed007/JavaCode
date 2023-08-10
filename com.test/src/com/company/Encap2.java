package com.company;

public class Encap2 {

    private String name;
    private int age;
    private String address;

    public Encap2(String name, int age, String address){

        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setName(String name){

        this.name = name;
    }

    public void setAge(int age){

        this.age = age;
    }

    public void setAddress(String address){

        this.address = address;
    }

    public String getName(){

        return name;
    }

    public int getAge(){

        return age;
    }

    public String getAddress(){

        return address;
    }

    @Override
    public String toString(){
        return ("Student name is: " +this.getName()+", age is:  "+this.getAge()+", address is: "+this.getAddress());

    }

    public static void main(String[] args){

        Encap2 john = new Encap2("John Adams", 34, "234 Aleax ave");

        System.out.println(john.name);
        System.out.println(john.age);
        System.out.println(john.getAddress());

    }



}
