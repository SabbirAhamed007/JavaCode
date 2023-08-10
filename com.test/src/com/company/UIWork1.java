package com.company;

import javax.swing.*;

public class UIWork1 {

    public static void main(String[] args){

        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, "Name: " + name);


        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        JOptionPane.showMessageDialog(null, "Age: " + age);

        double amount = Double.parseDouble(JOptionPane.showInputDialog("Enter your amount: "));
        JOptionPane.showMessageDialog(null, "Amount: " + amount);


    }
}

