package com.company;

import javax.swing.*;

public class UITT {

    public static void main(String[] args){

        String name = JOptionPane.showInputDialog("Please enter your name: ");
        JOptionPane.showMessageDialog(null, "Name: " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Please enter your age: "));
        JOptionPane.showMessageDialog(null, "Age: " + age);

        float view = Float.parseFloat(JOptionPane.showInputDialog("Please enter your number of views: "));
        JOptionPane.showMessageDialog(null, "View: " + view);
    }
}
