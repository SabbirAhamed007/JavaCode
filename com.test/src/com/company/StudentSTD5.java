package com.company;

public class StudentSTD5 {

    String name;
    String id;
    int age;
    String address;

    public StudentSTD5(String name, String id, int age, String address){

        this.name = name;
        this.id = id;
        this.age = age;
        this.address = address;

    }

    public void setName(String name){

        this.name = name;
    }

    public void setId(String id){

        this.id = id;
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

    public String getId(){

        return  id;
    }

    public int getAge(){

        return age;
    }

    public String getAddress(){

        return address;
    }

    @Override

    public String toString(){

        return ("Student name is: "+ this.getName() + ", and ID is: " + this.getId()+ ",. Age is: "+ this.getAge()+ ". Address is: "+ this.getAddress()+".");
    }

    public static void main(String[] args){

        StudentSTD5 sabbir = new StudentSTD5("Sabbir", "EN5011", 41, "234 Preakness Ave.");
        System.out.println(sabbir.toString());
    }






}
