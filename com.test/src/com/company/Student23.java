package com.company;

public class Student23 {

    private String name;
    private int age;
    private String address;


    public Student23(String name, int age, String address){

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

        return ("Student name is: " + this.getName() + "Student age is: "+ this.getAge() + "Student address is: "+ this.getAddress());

    }

    public static void main(String[] args){

        Student23 john = new Student23("John Adams", 56, "234 Hazard St");

        System.out.println(john.name);
    }
}
