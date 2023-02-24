/*
*    Java swing program to implement the concept of JProgressBar....
* */

package com.java_swing_by_swaraj;

import javax.swing.*;
import java.awt.*;

public class jprogress_bar {
    public static void main(String[] args) {
        JFrame f = new JFrame("JProgress bar");
        f.setLayout(new FlowLayout());
        f.setSize(200, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        JLabel label = new JLabel();
        label.setText("password");
        label.setBounds(20, 80, 80, 30);
        f.add(label);
       // JPasswordField pwd = new JPasswordField();
        //pwd.setBounds(130, 80, 100, 30);
        JProgressBar jp = new JProgressBar(0, 100);
        f.add(jp);
        jp.setStringPainted(true);
       // jp.setOrientation(SwingConstants.VERTICAL);
        int i = 0;
        while (i <= 100) {
            jp.setValue(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            i+=10;
        }
    }
}
