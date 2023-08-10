package com.company;

public class SuvBMW extends BMW{

    public int seatHeight;

    public SuvBMW(int startHeight, int startSpeed, int startGear){

        super(startGear, startSpeed);
        seatHeight = startHeight;
    }

    public void setHeight(int newValue){

        seatHeight = newValue;


    }


}
