package com.company;

public class TestCons {

    String name;
    String idNumber;
    int rollNumber;

    public TestCons(String name, String idNumber, int rollNumber){

        this.name = name;
        this.idNumber = idNumber;
        this.rollNumber = rollNumber;

    }

    public void setName(String name){

        this.name = name;
    }

    public void setIdNumber(String idNumber){

        this.idNumber = idNumber;
    }

    public void setRollNumber(int rollNumber){

        this.rollNumber = rollNumber;
    }

    public String getName(){

        return name;
    }

    public String getIdNumber(){

        return idNumber;
    }

    public int getRollNumber(){

        return rollNumber;
    }

    @Override

    public String toString(){

        return ("Name: " + this.getName() +", ID: "+ this.getIdNumber() +", Roll Numner: "+ this.getRollNumber()+".");
    }

    public static void main(String[] args){

        TestCons input = new TestCons("Sabbir Ahamed", "EN5011" , 45);

        System.out.println(input.name);
        System.out.println(input.idNumber);
        System.out.println(input.rollNumber);
    }

}
