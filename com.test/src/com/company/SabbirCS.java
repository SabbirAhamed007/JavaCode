package com.company;

public class SabbirCS {

    String name;
    int age;
    float height;
    String address;

    public SabbirCS(String name, int age, float height, String address){

        this.name = name;
        this.age = age;
        this.height = height;
        this.address = address;
    }

    public void setName(String name){

        this.name = name;
    }

    public void setAge(int age){
        this.age = age;

    }

    public void setHeight(float height){

        this.height = height;

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

    public float getHeight(){

        return height;
    }

    public String getAddress(){

        return address;
    }


//    @Override
//    public String toString(){
//        return ("Student name is " + this.getName()) + ", age is : " + this.getAge() + ", height is: " + this.getHeight() + "and address is : "+ this.getAddress());
//
//    }

    public static void main(String[] args){

        SabbirCS input = new SabbirCS("Sabbir Ahamed", 41, 5.9F, "234 Preakness ave, Paterson.");

    }


}
