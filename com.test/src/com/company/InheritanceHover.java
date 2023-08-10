package com.company;

public class InheritanceHover {

    public static void main(String[] args){


        JKHover jkHover = new JKHover(20, 10, 1);

        System.out.println("Gear is: " + jkHover.gear);
        System.out.println("Wheel height is: " + jkHover.wheelHeight);
        System.out.println("Hover speed is: " + jkHover.speed);

        jkHover.applyBreak(1);
        System.out.println("Hover speed after applying break: " + jkHover.speed);

    }
}
