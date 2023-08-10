package com.company;

public class MountainBike extends Bicycle{

    public int seatHeight;

    public MountainBike(int startGear, int startSpeed, int startHeight){

        super(startGear, startSpeed);
        seatHeight = startHeight;

    }

    public void setSeatHeight(int newValue){

        seatHeight = newValue;

    }
}
