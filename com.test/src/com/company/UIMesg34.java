package com.company;

import javax.swing.*;

public class UIMesg34 {

    public static void main(String[] args){

        String input = JOptionPane.showInputDialog("Please type your name: ");
        JOptionPane.showMessageDialog(null, "Name: " + input);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Please enter your age: "));
        JOptionPane.showMessageDialog(null,"Age: " + age);
    }
}
