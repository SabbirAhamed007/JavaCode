package com.company;

public class JKHover extends Hover{

    public int wheelHeight;

    public JKHover(int startWheelHeight, int startSpeed, int startGear){


        super(startSpeed, startGear);

        this.wheelHeight = startWheelHeight;


    }

    public void setWheelHeight(int newValue){


        wheelHeight = newValue;

    }


}
