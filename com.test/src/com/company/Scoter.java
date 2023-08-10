package com.company;

public class Scoter {

    protected int gear;
    protected int speed;

    public Scoter(int startGear, int startSpeed){

        gear = startGear;

        speed = startSpeed;


    }

    public void setGear(int newValue){

        gear = newValue;


    }

    public void setSpeed(int increment){

        speed += increment;
    }

    public void applyBreak(int derement){

        speed -= derement;
    }
}
