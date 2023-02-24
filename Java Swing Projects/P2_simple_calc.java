
/* Simple calculator using java swing */

package com.java_swing_by_swaraj;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class P2_simple_calc {
    public static void main(String[] args) {
        simpleCalc s = new simpleCalc();
        s.setTitle("Calculator");
        s.setLayout(null);
        s.setSize(400,400);
        s.setLocationRelativeTo(null);
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        s.setVisible(true);
    }
}

class simpleCalc extends JFrame  {
    Container c;
    JTextField t;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, div, mul, add, sub, equal, ast;

    public simpleCalc() {
        c = this.getContentPane();
        t = new JTextField();
        t.setBounds(200, 5, 200, 40);
        c.add(t);
        b7 = new JButton("7");
        b7.setBounds(10, 60, 50, 50);
        c.add(b7);
        b8 = new JButton("8");
        b8.setBounds(80, 60, 50, 50);
        c.add(b8);
        b9 = new JButton("9");
        b9.setBounds(150, 60, 50, 50);
        c.add(b9);

        b4 = new JButton("4");
        b4.setBounds(10, 120, 50, 50);
        c.add(b4);
        b5 = new JButton("5");
        b5.setBounds(80, 120, 50, 50);
        c.add(b5);
        b6 = new JButton("6");
        b6.setBounds(150, 120, 50, 50);
        c.add(b6);

        b1 = new JButton("1");
        b1.setBounds(10, 180, 50, 50);
        c.add(b1);
        b2 = new JButton("2");
        b2.setBounds(80, 180, 50, 50);
        c.add(b2);
        b3 = new JButton("3");
        b3.setBounds(150, 180, 50, 50);
        c.add(b3);

        b0 = new JButton("0");
        b0.setBounds(80, 240, 50, 50);
        c.add(b0);
        equal = new JButton("=");
        equal.setBounds(150, 240, 50, 50);
        equal.setBackground(Color.green);
        c.add(equal);
        ast = new JButton("%");
        ast.setBounds(10, 240, 50, 50);
        c.add(ast);

        Font f = new Font("arial", Font.BOLD, 20);

        div = new JButton("/");
        div.setFont(f);
        div.setBounds(220, 60, 50, 50);
        div.setBackground(Color.red);
        c.add(div);
        mul = new JButton("*");
        mul.setBounds(220, 120, 50, 50);
        mul.setBackground(Color.red);
        mul.setFont(f);
        c.add(mul);
        sub = new JButton("-");
        sub.setBounds(220, 180, 50, 50);
        sub.setBackground(Color.red);
        sub.setFont(f);
        c.add(sub);
        add = new JButton("+");
        add.setBounds(220, 240, 50, 50);
        add.setBackground(Color.red);
        add.setFont(f);
        c.add(add);
        b1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                t.setText(b1.getText());
            }
        });
        b2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                t.setText(b2.getText());
            }
        });
        b3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                t.setText(b3.getText());
            }
        });
        b4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                t.setText(b4.getText());
            }
        });
        b5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                t.setText(b5.getText());
            }
        });
        b6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                t.setText(b6.getText());
            }
        });
        b7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                t.setText(b7.getText());
            }
        });
        b8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                t.setText(b8.getText());
            }
        });

        b9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                t.setText(b9.getText());
            }
        });
        b0.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                t.setText(b0.getText());
            }
        });
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setText(add.getText());
            }
        });
        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setText(t.getText());
            }
        });
    }

}
