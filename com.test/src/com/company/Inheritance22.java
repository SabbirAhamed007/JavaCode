package com.company;

public class Inheritance22 {

    public static void main(String[] args){

        MountainMotorCycle mountainMotorCycle = new MountainMotorCycle(20,10,2);

        System.out.println("Gear is: " + mountainMotorCycle.gear);
        System.out.println("Speed is: " + mountainMotorCycle.speed);
        System.out.println("Seat height is: " + mountainMotorCycle.seatHeight);
        mountainMotorCycle.applyBreak(2);
        System.out.println("Bike speed after applying break is: " + mountainMotorCycle.speed);
    }
}
