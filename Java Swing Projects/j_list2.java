
/*
*      Java program to implement the concept of jList using swing...
* */

package com.java_swing_by_swaraj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class j_list2 extends JFrame {
    JTextField t1;
    JButton b1,b2,b3;
    JList list;
    int index = 0;
    public j_list2() {

        setSize(400, 400);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(new GridLayout(1, 2));
        t1 = new JTextField(15);

        b1 = new JButton("ADD");
        b2 = new JButton("UPDATE");
        b3 = new JButton("DELETE");

        list = new JList();
        JPanel panel = new JPanel();
        add(panel);
        panel.add(new JScrollPane(list));

        DefaultListModel model = new DefaultListModel();
        model.addElement("swaraj");
        model.addElement("ayush");
        model.addElement("aman");
        model.addElement("pankaj");
        list.setModel(model);
        JPanel panel2 = new JPanel();
        add(panel2);
        panel2.add(t1);
        panel2.add(b1);
        panel2.add(b2);
        panel2.add(b3);
        revalidate();
        try {
            b1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (!t1.getText().toString().isEmpty()) {
                        String input = t1.getText().toString();
                        model.addElement(input);
                        t1.setText(null);
                    }
                }
            });

            list.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (e.getClickCount() == 2) {
                        index = list.getSelectedIndex();
                        t1.setText((String) model.get(index));
                    }
                }
            });
            b2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (!t1.getText().toString().isEmpty()) {
                        String input = t1.getText().toString();
                        model.set(index, input);
                        t1.setText(null);
                    }
                }
            });
            b3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    model.remove(list.getSelectedIndex());
                }
            });
        } catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new j_list2();
    }
}
