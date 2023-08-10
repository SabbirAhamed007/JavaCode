package com.company;

import java.util.Scanner;

public class SwitchJa {

    public static void main(String[] args){


        Scanner day = new Scanner(System.in);

        System.out.print("What day it is: ");

        String toDay = day.nextLine().toLowerCase();

        switch (toDay){


            case "monday":

                System.out.println("Today is Monday, I have office.");

                break;

            case "tuesday":

                System.out.println("Today is Tuesday, I have office.");

                break;

            case "wednesday":

                System.out.println("Today is Wednesday, I have office.");

                break;

            case "thursday":

                System.out.println("Today is Thursday, I have office.");

                break;

            case "friday":

                System.out.println("Today is Friday, I have office.");

                break;

            case "saturday":

                System.out.println("Ohooo !!! Enjoy Saturday.");

                break;

            case "sunday":

                System.out.println("Ohooo !!! Enjoy Sunday.");

                break;

            default:

                System.out.print("What day it is: ");

                day.nextLine().toLowerCase();

                switch (toDay){


                    case "monday":

                        System.out.println("Today is Monday, I have office.");

                        break;

                    case "tuesday":

                        System.out.println("Today is Tuesday, I have office.");

                        break;

                    case "wednesday":

                        System.out.println("Today is Wednesday, I have office.");

                        break;

                    case "thursday":

                        System.out.println("Today is Thursday, I have office.");

                        break;

                    case "friday":

                        System.out.println("Today is Friday, I have office.");

                        break;

                    case "saturday":

                        System.out.println("Ohooo !!! Enjoy Saturday.");

                        break;

                    case "sunday":

                        System.out.println("Ohooo !!! Enjoy Sunday.");

                        break;

                    default:

                        System.out.print("What day it is: ");

                        day.nextLine().toLowerCase();




                }




        }
    }
}
