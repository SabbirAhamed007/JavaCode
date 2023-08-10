package com.company;

public class OneTouch {

    String name;
    String type;
    int quantity;

    public OneTouch(String name, String type, int quantity){

        this.name = name;
        this.type = type;
        this.quantity = quantity;
    }

    public void setName(String name){

        this.name = name;
    }

    public void setType(String type){

        this.type = type;
    }

    public void setQuantity(int quantity){

        this.quantity = quantity;
    }

    public String getName(){

        return name;
    }

    public String getType(){

        return type;
    }

    public int getQuantity(){

        return quantity;
    }


    @Override

    public String toString(){

        return ("Name: " + this.getName() +", Type: "+ this.getType() +", Quantity: " + this.getQuantity());

    }


}
