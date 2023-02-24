

/*
*    Java swing program to implement the concept of JTable and
*    perform operation like "add" "delete" "update"....
*
* */

package com.java_swing_by_swaraj;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Jtable_addrow {
    public static void main(String[] args) {
        new mytable();
    }
}
class mytable extends JFrame{
    JTable table;
    JButton b1,b2,b3;
    JTextField t1,t2,t3;
    public mytable(){
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        Object [][] data = {{"01","naman","25"},{"02","rakesh","35"},{"23","aman","45"}};
        String [] column = {"roll_no","names","age"};

        DefaultTableModel model = new DefaultTableModel(data,column);
        table = new JTable(model);
        setLayout(new GridLayout(3,1));
        JPanel panel = new JPanel();
        add(new JScrollPane(table));
        add(new JPanel());
        add(panel);

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();

        b1 = new JButton("add");
        b2 = new JButton("update");
        b3 = new JButton("delete");

        panel.setLayout(new GridLayout(3,3));
        panel.add(new JLabel("rollno"));
        panel.add(t1);
        panel.add(b1);

        panel.add(new JLabel("names"));
        panel.add(t2);
        panel.add(b2);

        panel.add(new JLabel("age"));
        panel.add(t3);
        panel.add(b3);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (t1.getText().toString().isEmpty() || t2.getText().toString().isEmpty() ||
                        t3.getText().toString().isEmpty()) {

                    JOptionPane.showMessageDialog(null, "please fill all the tables",
                            "error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                    else {
                        int rollno = Integer.parseInt(t1.getText().toString());
                        String names = t2.getText().toString();
                        int age = Integer.parseInt(t3.getText().toString());
                        Object[] newRow = {rollno, names, age};
                        model.addRow(newRow);
                        t1.setText(null);
                        t2.setText(null);
                        t3.setText(null);
                    }
                }

        });

       table.addMouseListener(new MouseAdapter() {
           @Override
           public void mouseClicked(MouseEvent e) {
               int rowIndex = table.getSelectedRow();
               int row = table.getSelectedRow();
               int rollno = (int)model.getValueAt(rowIndex,0);
               String names = (String)model.getValueAt(rowIndex,1);
               int age = (int)model.getValueAt(rowIndex,2);

               t1.setText(String.valueOf(rollno));
               t2.setText(String.valueOf(names));
               t3.setText(String.valueOf(age));

               b2.addActionListener(new ActionListener() {
                   @Override
                   public void actionPerformed(ActionEvent e) {
                       if (t1.getText().toString().isEmpty() || t2.getText().toString().isEmpty() ||
                               t3.getText().toString().isEmpty()) {

                           JOptionPane.showMessageDialog(null, "please fill all the tables",
                                   "error", JOptionPane.ERROR_MESSAGE);
                           return;
                       }
                       else
                       {
                           int rollno = Integer.parseInt(t1.getText().toString());
                           String names = t2.getText().toString();
                           int age = Integer.parseInt(t3.getText().toString());

                          // Object [] newrow = { rollno,names,age};
                           //model.addRow(newrow);
                           t1.setText(null);
                           t2.setText(null);
                           t3.setText(null);

                           int row = table.getSelectedRow();
                           model.setValueAt(rollno,row,0);
                           model.setValueAt(names,row,1);
                           model.setValueAt(age,row,2);
                       }
                   }
               });
           }
       });

    }
}
