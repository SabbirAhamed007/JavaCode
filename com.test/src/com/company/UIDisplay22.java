package com.company;

import javax.swing.*;

public class UIDisplay22 {

    public static void main(String[] args){


        String name = JOptionPane.showInputDialog("Please enter your name: ");

        JOptionPane.showMessageDialog(null, "Name: " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Please enter your age: "));
        JOptionPane.showMessageDialog(null, "Age: " + age);
    }
}