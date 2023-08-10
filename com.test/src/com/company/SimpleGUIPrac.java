package com.company;

import javax.swing.*;

public class SimpleGUIPrac {

    public static void main(String[] args){

        String name = JOptionPane.showInputDialog("What is your name: ");

        JOptionPane.showMessageDialog(null, "Your name is: " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));

        JOptionPane.showMessageDialog(null, "Age is: "+ age);


    }
}
