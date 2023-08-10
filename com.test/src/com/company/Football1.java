package com.company;

public class Football1 {

    String name;
    int size;
    String made;


    public Football1(String name, int size, String made){

        this.name = name;
        this.size = size;
        this.made = made;


    }


    public void setName(String name){

        this.name = name;
    }

    public void setSize(int size){

        this.size = size;
    }

    public void setMade(String made){

        this.made = made;
    }

    public String getName(){

        return name;
    }

    public int getSize(){

        return size;
    }

    public String getMade(){

        return made;
    }

    @Override

    public String toString(){

        return ("Ball name is: "+ name +". Ball size is: "+ size +", Ball made in: "+made+".");

    }

    public static void main(String[] args){

        Football1 tango = new Football1("Tango", 6, "Italy");

        System.out.println(tango.name);
        System.out.println(tango.size);
        System.out.println(tango.made);

    }


}
