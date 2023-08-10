package com.company;

public class PlayerACMilan {


    String name;
    int jerseyNumber;
    int age;
    String address;


    public PlayerACMilan(String name, int jerseyNumber, int age, String address){

        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.age = age;
        this.address = address;

    }

    public void setName(String name){

        this.name = name;

    }

    public void setJerseyNumber(int jerseyNumber){

        this.jerseyNumber = jerseyNumber;
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

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public int getAge(){

        return age;
    }

    public String getAddress(){

        return address;
    }


    @Override

    public String toString(){

        return ("Player name is: "+ this.getName() + ", JerseyNumber is: " +this.getJerseyNumber() +", age is: "+ this.getAge() +", Address is: "+ this.getAddress());


    }

    public static void main(String[] args){

        PlayerACMilan sabbir = new PlayerACMilan("Sabbir Ahamed", 10, 41, "234 Preakness Ave");

        System.out.println(sabbir.toString());
    }

}
