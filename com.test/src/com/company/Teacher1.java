package com.company;

public class Teacher1 {

    String name;
    int age;
    String address;

    public Teacher1(String name, int age, String address){

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

        return ("Teacher name is: " + this.getName()+ ", Age is: " + this.getAge()+ ", Address is: "+ this.getAddress()+".");


    }

    public static void main(String[] args){

        Teacher1 john = new Teacher1("John Adams", 41, "222 Poulison ave");
        System.out.println(john.toString());
    }



}
