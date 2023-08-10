package com.company;

import javax.swing.*;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class GUITest21 {

    public static void main(String[] args){


        String name = JOptionPane.showInputDialog("Please enter your name: ");
        JOptionPane.showMessageDialog(null, "Name: " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Please enter your age: "));

        JOptionPane.showMessageDialog(null, "Age: " + age);

        String group = JOptionPane.showInputDialog("Please enter your group name: ");
        JOptionPane.showMessageDialog(null, "Group: " + group);
    }
}
