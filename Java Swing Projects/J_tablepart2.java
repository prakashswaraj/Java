
/*
*    Java swing program to implement the concept of JTable...
* */
package com.java_swing_by_swaraj;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class J_tablepart2 {
    public static void main(String[] args) {
        new tableModel();
    }
}
class tableModel extends JFrame {
    tableModel() {
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        String [][] data = {{"01","ram","20"},{"02","shyam","21"},{"03","rajesh","22"}};
        String [] column = {"rollno","names","age"};
        DefaultTableModel model = new DefaultTableModel(data,column);
        JTable table = new JTable(model);
       add (new JScrollPane(table));
        validate();
    }
}
