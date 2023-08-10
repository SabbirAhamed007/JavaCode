package com.company;

import javax.swing.*;

public class GUITedt {

    public static void main(String[] args){

        String name = JOptionPane.showInputDialog("Please enter your name: ");

        JOptionPane.showMessageDialog(null, "Name: " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age please: "));

        JOptionPane.showMessageDialog(null, "Age: " + age);

    }
}

