package TestCoding;

import java.util.Scanner;

public class SwitchMethod2 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your fabourite color: ");

        String color = input.nextLine().toLowerCase();

        switch (color){

            case "red":

                System.out.println("Red is a nice color.");
                break;


            case "white":

                System.out.println("White is a official color.");

                break;

            case "black":
                System.out.println("Black is a common color.");

                break;

            default:

                System.out.println("I am not sure.");
        }

    }
}
