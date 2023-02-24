
/*
*    Java swing programs to create a password field..
* */


package com.company;

import javax.swing.*;
import java.awt.*;

public class MyPassword {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setBounds(100,100,300,300);
        Container c = f.getContentPane();
        c.setLayout(null);
        JPasswordField p = new JPasswordField();
        p.setBounds(50,50,120,30);
        c.add(p);
        p.setText("nandini");
        Font font = new Font("Arial",Font.BOLD,30);
        p.setFont(font);
      //  p.setEchoChar('*');
        p.setEchoChar((char)0);

    }
}
