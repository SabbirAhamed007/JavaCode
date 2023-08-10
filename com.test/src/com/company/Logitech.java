package com.company;

public class Logitech {

    String name;

    String product;

    int year;

    public Logitech(String name, String product, int year){

        this.name = name;

        this.product = product;

        this.year = year;

    }

    public void setName(String name){

        this.name = name;


    }

    public void setProduct(String product){

        this.product = product;
    }

    public void setYear(int year){

        this.year = year;
    }

    public String getName(){

        return name;
    }

    public String getProduct(){

        return product;
    }

    public int getYear(){

        return year;
    }

    @Override

    public String toString(){

        return ("Name: " + this.getName() +", Product: "+ this.getProduct() + "Year: " + this.getYear());
    }

    public static void main(String[] args){

        Logitech mouse = new Logitech("Logitech" , "Mouse", 2023);

        System.out.println(mouse.name);
        System.out.println(mouse.product);
        System.out.println(mouse.year);
    }

}
