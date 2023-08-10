package com.company;

import javax.swing.*;

public class UITestcode {

    public static void main(String[] args){

        String name = JOptionPane.showInputDialog("Please enter your name: ");
        JOptionPane.showMessageDialog(null, "Name: " + name);

        int age =Integer.parseInt(JOptionPane.showInputDialog("Pelase enter your age: "));
        JOptionPane.showMessageDialog(null, "Age: " + age);

    }
}
