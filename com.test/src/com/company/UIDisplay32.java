package com.company;

import javax.swing.*;

public class UIDisplay32 {

    public static void main(String[] args){

        String name = JOptionPane.showInputDialog("Please enter your name: ");
        JOptionPane.showMessageDialog(null, "Name: "+ name);

        String idNum = JOptionPane.showInputDialog("Enter your ID: ");
        JOptionPane.showMessageDialog(null, "ID: " + idNum);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        JOptionPane.showMessageDialog(null, "Age: "+ age);


    }
}
