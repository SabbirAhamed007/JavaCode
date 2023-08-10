package com.company;

import javax.swing.*;
import java.awt.*;

public class uiTest8 {


   public static void main(String[] args){

       String name = JOptionPane.showInputDialog("Please enter your name: ");

       JOptionPane.showMessageDialog(null, "Name: " + name);

       int age = Integer.parseInt(JOptionPane.showInputDialog("Please enter your age: "));

       JOptionPane.showMessageDialog(null, "Age: " + age);

       String hairColor = JOptionPane.showInputDialog("Please enter your hair color: ");

       JOptionPane.showMessageDialog(null, "Name: " + hairColor);




   }


}
