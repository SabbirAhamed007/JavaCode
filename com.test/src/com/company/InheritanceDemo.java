package com.company;

public class InheritanceDemo {

    public static void main(String[] args){

        MountainBike mountianBike = new MountainBike(2,10,1);

        System.out.println("Gear: " + mountianBike.gear);
        System.out.println("Seat height is: " + mountianBike.seatHeight);
        System.out.println("Bike speed is: " + mountianBike.speed);
        mountianBike.applyBreak(1);
        System.out.println("Bike speed after applying break is: " + mountianBike.speed);
    }
}
