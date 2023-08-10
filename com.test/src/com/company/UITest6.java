package com.company;

import javax.swing.*;

public class UITest6 {

    public static void main(String[] args){

        String name = JOptionPane.showInputDialog("Please enter your name: ");

        JOptionPane.showMessageDialog(null, "Name: "+ name);

        int idNumber = Integer.parseInt(JOptionPane.showInputDialog("Please enter your age: "));
        JOptionPane.showMessageDialog(null, "ID: "+idNumber);
    }
}
