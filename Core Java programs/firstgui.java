
/*
*  simple java swing program to implement jLabel and jFrame ...
* */

package com.company;

import javax.swing.*;
import java.awt.*;

public class firstgui {
    public static void main(String[] args) {
        abc obj = new abc();

    }
}
class abc extends JFrame{
    public abc(){
        JLabel l = new JLabel("hello world");
        JLabel l1 = new JLabel("swaraj");
        add(l1);
        add(l);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(300,300);
        setDefaultCloseOperation(3);
    }
}
