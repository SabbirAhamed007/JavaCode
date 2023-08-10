package com.company;

import javax.swing.*;

public class GUIJava2 {

    public static void main(String[] args){


        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, "Name: " + name);


        int age = Integer.parseInt(JOptionPane.showInputDialog("Age please !:  "));
        JOptionPane.showMessageDialog(null, "Your age is: " + age);

        double height = Double.parseDouble(JOptionPane.showInputDialog("Please enter your height: "));
        JOptionPane.showMessageDialog(null, "Your height is: " + height);


    }
}
