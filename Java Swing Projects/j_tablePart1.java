/*
*    Java swing program to implement the concept of jTable...
* */

package com.java_swing_by_swaraj;

import javax.swing.*;

public class j_tablePart1 {
    public static void main(String[] args) {
        String [][] data = {{"01","nandini","21"},{"02","swaraj","22"},{"03","anand","20"}};
        String [] column = {"roll_no","name","age"};
        JTable table  = new JTable(data,column);
        JFrame f = new JFrame("TableDemo");
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.add(new JScrollPane(table));
       //validate();
    }
}
