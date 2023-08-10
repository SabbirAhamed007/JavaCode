package com.company;

import javax.swing.*;

public class UIT {

    public static void main(String[] args){


        String name = JOptionPane.showInputDialog("Name please: ");
        JOptionPane.showMessageDialog(null,"Name: " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Age please: "));
        JOptionPane.showMessageDialog(null, "Age: "+ age);
    }
}

