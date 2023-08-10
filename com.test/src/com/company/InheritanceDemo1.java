package com.company;

public class InheritanceDemo1 {

    public static void main(String[] args){

        Vaspa vaspa = new Vaspa(10, 23, 2);

        System.out.println("Gear is: " + vaspa.gear);
        System.out.println("Seat height is: " + vaspa.seatHeight);
        System.out.println("Speed is: "+ vaspa.speed);

        vaspa.applyBreak(1);
        System.out.println("Vaspa speed after applying break is: "+ vaspa.speed);
    }
}
