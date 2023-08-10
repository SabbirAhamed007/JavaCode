package com.company;

import javax.swing.*;

public class UITest12 {

    public static void main(String[] args){

        String name = JOptionPane.showInputDialog("What is your name: ");
        JOptionPane.showMessageDialog(null, "Name: " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age: "));
        JOptionPane.showMessageDialog(null, "Age : " + age);

        double weight = Double.parseDouble(JOptionPane.showInputDialog("What is your weight: "));
        JOptionPane.showMessageDialog(null, "Age : " + weight);



    }
}

