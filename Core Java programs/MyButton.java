

/*
*    Java swing  programs to create a clickable button...
* */

package com.company;

import javax.swing.*;
import java.awt.*;

public class MyButton {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setBounds(100,100,300,300);
        f.setResizable(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container  c = f.getContentPane();
        c.setLayout(null);
        JButton btn = new JButton();
        btn.setSize(400,50);
        btn.setLocation(200,200);
        c.add(btn);
        //f.setVisible(true);
        Font font = new Font("arial",Font.BOLD,25);
        btn.setFont(font);
        btn.setText("CLICK");
        btn.setForeground(Color.RED);
        btn.setBackground(Color.yellow);
        Cursor cur = new Cursor(Cursor.HAND_CURSOR);
        btn.setCursor(cur);
        btn.setEnabled(true);
        btn.setVisible(true);
    }
}
