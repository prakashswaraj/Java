
/*
*       Java swing  program to make a simple calculator...
* */

package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class simpleCalculator {
    public static void main(String[] args) {
        calculator calc = new calculator();
        calc.setTitle("calculator");
        calc.setBounds(100,100,500,400);
        calc.setDefaultCloseOperation(calc.EXIT_ON_CLOSE);
        calc.setResizable(false);
        //calc.setVisible(true);
    }
}

class calculator extends JFrame implements ActionListener{
    Container c;
    JTextField t1,t2;
    JLabel l1,l2,result;
    JButton add,sub,mul,div;

    calculator(){
        c = this.getContentPane();
        c.setLayout(null);
        l1 = new JLabel();
        l2 = new JLabel();
        l1.setText("FirstNumber: ");
        l2.setText("secondNumber: ");
        l1.setBounds(10,20,100,20);
        l2.setBounds(10,50,100,20);
        c.add(l1);
        c.add(l2);
        t1 = new JTextField();
        t2 = new JTextField();
        t1.setBounds(120,20,100,20);
        t2.setBounds(120,50,100,20);
        c.add(t1);
        c.add(t2);
        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        add.setBounds(10,80,50,30);
        sub.setBounds(70,80,50,30);
        mul.setBounds(110,80,50,30);
        div.setBounds(190,80,50,30);
        c.add(add);
        c.add(sub);
        c.add(mul);
        c.add(div);
        result = new JLabel("RESULT: ");
        result.setBounds(10,120,150,20);
        c.add(result);
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        try {
            if (e.getSource() == add) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t1.getText());
                int c = a + b;
                result.setText("Result :" + c);
            }
            if (e.getSource() == sub) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t1.getText());
                int c = a - b;
                result.setText("Result :" + c);
            }
            if (e.getSource() == mul) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t1.getText());
                int c = a * b;
                result.setText("Result :" + c);
            }
            if (e.getSource() == div) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t1.getText());
                int c = a / b;
                result.setText("Result :" + c);
            }
        }
        catch(NumberFormatException e1){
            result.setText("enter only integer");
        }
        catch(ArithmeticException e2){
            result.setText("cannot divide by zero:");
        }

    }

}


