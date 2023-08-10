package com.company;

import javax.swing.*;

public class UIDisplay1 {
    public static void main(String[] args){




        String nmae = JOptionPane.showInputDialog("What is your name: ");
        JOptionPane.showMessageDialog(null, "Name: " + nmae);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        JOptionPane.showMessageDialog(null, "Age: " + age);





    }
}

