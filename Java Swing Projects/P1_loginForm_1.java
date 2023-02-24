

/*
*    Java swing program to create a  simple login form...
* */

package com.java_swing_by_swaraj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class P1_loginForm_1 extends JFrame implements ActionListener {
    Container c;
    JLabel label1, label2;
    JButton btn;
    JTextField t;
    JPasswordField pf;

    public P1_loginForm_1() {
        c = this.getContentPane();
        setTitle("LOGIN_FORM");
        setSize(400, 400);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        label1 = new JLabel("User Name: ");
        label1.setBounds(30, 50, 100, 30);
        label2 = new JLabel("Password: ");
        label2.setBounds(30, 110, 100, 30);
        c.add(label1);
        t = new JTextField();
        t.setBounds(170, 50, 100, 30);

        c.add(label2);
        c.add(t);
        pf = new JPasswordField();
        pf.setBounds(170, 110, 100, 30);
        pf.setEchoChar('*');
        c.add(pf);
        btn = new JButton("login");
        btn.setBounds(85, 150, 80, 30);
        c.add(btn);
        btn.addActionListener(this);

      /*  btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("userName:: " +t.getText());
                System.out.println("password:: " +pf.getText());
                c.setBackground(Color.green);
            }
        });*/
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("userName:: " + t.getText());
        System.out.println("password:: " + pf.getText());
        c.setBackground(Color.green);
    }


    //class driver {//
        public static void main(String[] args) {
            new P1_loginForm_1();
        }

    }