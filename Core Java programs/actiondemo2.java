
/*
*     Java programs to implement actionListener and action event...
 * */

package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java .awt.*;
public class actiondemo2 {
    public static void main(String[] args) {
        myframe2 f = new myframe2();
        f.setBounds(100,100,500,500);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setResizable(true);
        f.setVisible(true);
    }
}
class myframe2 extends JFrame implements ActionListener{
    Container c;
    JButton btn1= new JButton("RED");
    JButton btn2= new JButton("YELLOW");
    JButton btn3= new JButton("BLUE");
    myframe2() {
        c = this.getContentPane();
        c.setLayout(null);
        btn1.setBounds(100,100,100,40);
        btn2.setBounds(250,100,100,40);
        btn3.setBounds(400,100,100,40);
        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btn1){
            c.setBackground(Color.RED);
        }
         if(e.getSource()==btn2){
            c.setBackground(Color.YELLOW);
        }
        if(e.getSource()==btn3)
        {
            c.setBackground(Color.BLUE);
        }
    }
}
