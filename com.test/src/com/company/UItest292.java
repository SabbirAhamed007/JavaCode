package com.company;

import javax.swing.*;

public class UItest292 {

    public static void main(String[] args){

        String name = JOptionPane.showInputDialog("PLease enter your name: ");
        JOptionPane.showMessageDialog(null, "Name: "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Please enter age: "));
        JOptionPane.showMessageDialog(null, "Age: "+age);
    }
}
