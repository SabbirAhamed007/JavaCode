package com.company;

public class MyStudent {

    String name;
    int roll;
    int age;
    String gender;



    public MyStudent(){

        this.name = name;
        this.roll = roll;
        this.age = age;
        this.gender = gender;

    }

    public void setName(String name){

        this.name = name;
    }

    public void setRoll(int roll){

        this.roll = roll;
    }

    public void setAge(int age){

        this.age = age;
    }

    public void setGender(String gender){

        this.gender = gender;
    }


    public String getName(){

        return name;
    }

    public int getRoll(){

        return roll;
    }

    public int getAge(){

        return age;
    }

    public String getGender(){
        return gender;

    }

    @Override
    public String toString(){

        return ("Student name is: " + this.getName() +", roll is: " + this.getRoll() + ", age is: " + this.getAge() + ",gender is: "+ this.getGender());

    }

    public static void main(String[] args){

       // MyStudent sabbir = new MyStudent("Sabbir", 205, 41, "male");

        //System.out.println(sabbir.toString());



    }

}
