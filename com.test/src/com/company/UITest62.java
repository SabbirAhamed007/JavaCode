package com.company;

import javax.swing.*;

public class UITest62 {

    public static void main(String[] args){

        String name = JOptionPane.showInputDialog("Please enter your name: ");
        JOptionPane.showMessageDialog(null, "Name: " + name);

        float height = Float.parseFloat(JOptionPane.showInputDialog("Please enter your height: "));
        JOptionPane.showMessageDialog(null, "Height: " + height);

    }
}
