/*
*  Java Program to  implement Action listener in java swing
* */

package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


     class  myframe extends JFrame implements ActionListener{
        Container c;
        myframe() {
            c = this.getContentPane();
            c.setLayout(null);
            JButton btn = new JButton();
            btn.setText("click me");
            btn.setBounds(100,100,100,40);
            c.add(btn);
            btn.addActionListener(this);
        }
         @Override
         public void actionPerformed(ActionEvent e) {
             c.setBackground(Color.yellow);
         }
     }


class actiondemo{
    public static void main(String[] args) {
        myframe f = new myframe();
        f.setBounds(300,300,700,500);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setVisible(true);
    }
}