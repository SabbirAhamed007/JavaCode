package com.company;

public class PressureMachone {

    String name;
    int age;
    float pressure;


    public PressureMachone(String name, int age, float pressure){

        this.name = name;
        this.age = age;
        this.pressure = pressure;

    }

    public void setName(String name){

        this.name = name;
    }

    public void setAge(int age){

        this.age = age;
    }

    public void setPressure(float pressure){

        this.pressure = pressure;
    }

    public String getName(){

        return name;
    }

    public int getAge(){
        return age;
    }

    public float getPressure(){

        return pressure;
    }

    @Override

    public String toString(){

        return ("Name: " + this.getName()+", Age: "+ this.getAge() +", Pressure: "+ this.getPressure());
    }

    public static void main(String[] args){

        PressureMachone automaticArm = new PressureMachone("Sabbir ahamed", 42, 120.50F);

        System.out.println(automaticArm.name);
        System.out.println(automaticArm.age);
        System.out.println(automaticArm.pressure);
    }



}
