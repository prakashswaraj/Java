/*
 *        Java programs to create simple application form...
 */



package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
public class applicationForm {
    public static void main(String[] args) {
        application app = new application();
        app.setTitle("Application Form");
        app.setBounds(100,100,500,500);
        app.setDefaultCloseOperation(app.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}

class application extends JFrame implements ActionListener{
    Container c;
    JButton btn = new JButton("LOGIN");
    JLabel label1,label2;
    JTextField t1;
    JPasswordField t2;
    application(){
        c = this.getContentPane();
        c.setLayout(null);
        label1 = new JLabel("USERNAME: ");
        label2 = new JLabel("PASSWORD: ");
        label1.setBounds(10,50,100,20);
        label2.setBounds(10, 100,100,20);
        c.add(label1);
        c.add(label2);
         t1 = new JTextField();
         t2 = new JPasswordField();
         t2.setEchoChar((char)0);
        t1.setBounds(120,50,120,20);
        t2.setBounds(120,100,120,20);
        c.add(t1);
        c.add(t2);
        btn.setBounds(100,150,70,20);
        c.add(btn);
        btn.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn){
            c.setBackground(Color.green);
            System.out.println("USERNAME: "+t1.getText());
            System.out.println("PASSWORD: "+t2.getText());
        }
    }
}
