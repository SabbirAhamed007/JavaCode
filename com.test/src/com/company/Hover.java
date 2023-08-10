package com.company;

public class Hover {

    protected int gear;
    protected int speed;

    public Hover(int startSpeed, int startGear){

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
