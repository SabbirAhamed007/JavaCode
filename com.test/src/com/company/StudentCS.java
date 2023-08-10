package com.company;

public class StudentCS {


    String name;
    int age;
    String address;

    public StudentCS(String name, int age, String address){

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

        return ("Student nme is :" + this.getName() + ", age is : " + this.getAge() + "and address is: "+ this.getAddress());

    }

    public static void main(String[] args){

        StudentCS john = new StudentCS("John", 25, "23 Preakneass ave CA.");

        System.out.println(john.toString());
    }



}
