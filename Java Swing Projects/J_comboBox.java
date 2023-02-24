
/*
*   Java swing program to implement the concept of comboBox...
* */

package com.java_swing_by_swaraj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class J_comboBox {
    public static void main(String[] args) {
        ComboBox cb = new ComboBox();
        cb.setTitle("item listener");
        cb.setLayout( new BorderLayout());
        cb.setBounds(100,100,500,500);
        cb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cb.setVisible(true);
    }
}

class ComboBox extends JFrame implements ItemListener{
    JTextField t;
    JComboBox cm;
    Container c;
    JCheckBoxMenuItem item;
    JTextArea ta;
    JMenuBar mb;
    JMenu menu;

    public ComboBox(){
      c= this.getContentPane();
      t = new JTextField();
      t.setBounds(140,50,100,20);
      c.add(t);
      String [] str = {"jan","feb","march","apr","may","june","july","august","sept","oct","nov","dec"};
      cm = new JComboBox(str);
      cm.setBounds(40,50,80,20);
      c.add(cm);
      cm.addItemListener(this);

      item = new JCheckBoxMenuItem("print");
      mb = new JMenuBar();
      menu = new JMenu("file");
      menu.add(item);
      mb.add(menu);
      this.setJMenuBar(mb);
      ta = new JTextArea();
      ta.setBounds(40,70,100,30);
      c.add(ta);
        menu.addItemListener(this);




    }
    public void itemStateChanged(ItemEvent e){
        String str = cm.getSelectedItem().toString();
        t.setText(str);
        if(mb.isSelected()){
            ta.setText("print is on");
        }
        else{
            ta.setText("print is off");
        }
    }

}

