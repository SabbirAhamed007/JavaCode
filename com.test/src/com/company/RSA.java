package com.company;

public class RSA {

    String name;
    String model;
    int bar;

    public RSA(String name, String model, int bar){

        this.name = name;

        this.model = model;

        this.bar = bar;

    }


    public void setName(String name){

        this.name = name;

    }

    public void setModel(String model){

        this.model = model;
    }

    public void setBar(int bar){

        this.bar = bar;
    }

    public String getName(){

        return name;
    }

    public String getModel(){

        return model;
    }

    public int getBar(){

        return bar;
    }

    @Override

    public String toString(){

        return ("Name: " + this.getName() + "Model: "+ this.getModel()+ "Bar: " + this.getBar());
    }

    public static void main(String[] args){

        RSA input = new RSA("RSA", "Secured", 543535432);

        System.out.println(input.name);
        System.out.println(input.model);
        System.out.println(input.bar);

    }



}
