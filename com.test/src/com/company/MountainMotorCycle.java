package com.company;

public class MountainMotorCycle extends MotorCycle{

    public int seatHeight;

    public MountainMotorCycle(int startHeight, int startSpeed, int startGear){

        super(startSpeed, startGear);
        seatHeight = startHeight;

    }

    public void setSeatHeight(int newValue){

        seatHeight = newValue;
    }


}
