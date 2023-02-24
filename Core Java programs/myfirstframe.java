
/*
*    Java swing  program to set the background color red...
* */

package com.company;

import javax.swing.*;
import java.awt.*;

public class myfirstframe {
    public static void main(String[] args) {
        JFrame frame  = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,500);
        frame.setLocation(100,100);
        frame.setTitle("SWING");
        ImageIcon icon = new ImageIcon();frame.setIconImage(icon.getImage());
        Container c= frame.getContentPane();
        c.setBackground(Color.RED);
        frame.setResizable(false);
    }
}
