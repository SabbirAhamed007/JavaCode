package com.company;

public class BMW {

    protected int gear;
    protected int speed;



    public BMW(int startGear, int startSpeed){

        gear = startGear;

        speed = startSpeed;

    }

    public void setGear(int newValue){

        gear = newValue;
    }

    public void applyBreak(int decrement){

        speed -= decrement;
    }

    public void speedUp(int increment){

        speed += increment;

    }
}
