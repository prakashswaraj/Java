
/*
*    Java swing programs to create a text field
* */

package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ConcurrentModificationException;

public class MyTextField {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500,500,100,100);
        Container c = frame.getContentPane();
        c.setLayout(null);
        JTextField t1 = new JTextField();
        t1.setBounds(150,100,200,50);
        c.add(t1);
        t1.setText("swaraj prakash");
        Font font = new Font("Arial",Font.BOLD,20);
        t1.setFont(font);
        t1.setForeground(Color.green);
        t1.setBackground(Color.yellow);
        t1.setEditable(false);
        frame.setVisible(true);
    }
}
