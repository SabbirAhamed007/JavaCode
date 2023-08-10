package com.company;

public class Student76 {

    String name;
    int age;
    String address;

    public Student76(String name, int age, String address){

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
        return ("Student name: "+ this.getName() +", Student age: "+ this.getAge() +", Student address: "+ this.getAddress() +".");

    }

    public static void main(String[] args){

        Student76 sabbir = new Student76("Sabbir Ahamed", 41, "233 Paterson Ave. Totowa, Nj.");
        System.out.println(sabbir.toString());
    }





}
