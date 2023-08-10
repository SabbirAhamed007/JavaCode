package com.company;

import javax.swing.*;

public class GUIJava3 {

    public static void main(String[] args){

        String name = JOptionPane.showInputDialog("Type your name: ");

        JOptionPane.showMessageDialog(null, "Name is: " + name);


        int age = Integer.parseInt(JOptionPane.showInputDialog("Type your age please: "));

        JOptionPane.showMessageDialog(null, "Your age is: " + age);

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height: "));
        JOptionPane.showMessageDialog(null, "Height: " + height);

        String clubName = JOptionPane.showInputDialog("Enter your club name: ");
        JOptionPane.showMessageDialog(null, "Club: " +clubName);


    }
}
