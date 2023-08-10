package com.company;

public class QAAutomation {

    String name;
    int age;
    String team;

    public QAAutomation(String name, int age, String team){

        this.name = name;

        this.age = age;

        this.team = team;

    }

    public void setName(String name){

        this.name = name;
    }

    public void setAge(int age){

        this.age = age;
    }

    public void setTeam(String team){

        this.team = team;
    }

    public String getName(){

        return name;
    }

    public int getAge(){

        return age;
    }

    public String getTeam(){

        return team;
    }

    @Override

    public String toString(){


        return ("Name: " + this.getName() +", Age: "+ this.getAge() +", Team: "+ this.getTeam());
    }

    public static void main(String[] args){


        QAAutomation sabbir = new QAAutomation("Sabbir Ahamed", 42, "Titan");

        System.out.println(sabbir.getName());

        System.out.println(sabbir.getAge());

        System.out.println(sabbir.getTeam());
    }


}
