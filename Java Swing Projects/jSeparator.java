

/*
*    Java swing program to implement the concept of JSeparator...
* */

package com.java_swing_by_swaraj;

import javax.swing.*;
import java.awt.*;

public class jSeparator extends JFrame {
    public jSeparator(){
        setLayout(new FlowLayout());
        setSize(400,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(1,0));
        p.add(new JLabel("my first label"));
        p.add(new JLabel("my second label"));
        add(p);

        JMenuBar mb = new JMenuBar();
        add(mb,BorderLayout.PAGE_START);
        JMenu file = new JMenu("file");
        JMenu edit= new JMenu("edit");
        mb.add(file);
        mb.add(edit);
        JMenuItem undo = new JMenuItem("undo");
        JMenuItem redo = new JMenuItem("redo");
        JMenuItem cut = new JMenuItem("cut");
        JMenuItem copy= new JMenuItem("copy");
        JMenuItem paste = new JMenuItem("paste");
        JMenuItem find = new JMenuItem("find");
        JMenuItem replace = new JMenuItem("replace");
        JMenuItem format = new JMenuItem("format");

        edit.add(undo);
        edit.add(redo);
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(find);
        edit.add(replace);
        edit.add(format);
        validate();
    }

    public static void main(String[] args) {
        new jSeparator();
    }
}
