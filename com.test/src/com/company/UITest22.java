package com.company;

import javax.swing.*;

public class UITest22 {
    public static void main(String[] args){


        String name = JOptionPane.showInputDialog("Please enter your name: ");
        JOptionPane.showMessageDialog(null, "Name: " + name);

        int roll = Integer.parseInt(JOptionPane.showInputDialog("Enter your roll number: "));
        JOptionPane.showMessageDialog(null, "Roll: "+ roll);
    }
}
