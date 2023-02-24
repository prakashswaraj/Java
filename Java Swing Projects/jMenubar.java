
/*
*    Java swing program to implement the concept of jMenubar...
* */

package com.java_swing_by_swaraj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jMenubar extends JFrame implements ActionListener {
    JMenuBar mb;
    JMenu day,month;
    JMenuItem jan,feb,mar,apr,may,jun,jul,aug,sep,oct,nov,dec,sun,mon,tues,wed,thur,fri,sat;
    JTextField t1,t2;
    public jMenubar(){
        Container c = this.getContentPane();
        c.setLayout(null);
        mb = new JMenuBar();
        day = new JMenu("day");
        month = new JMenu("month");
      month.add(jan = new JMenuItem("january"));
        month.add(feb = new JMenuItem("february"));
        month.add(mar = new JMenuItem("march"));
        month.add(apr = new JMenuItem("april"));
        month.add (may = new JMenuItem("may"));
        month.add(jun = new JMenuItem("june"));
        month.add( jul = new JMenuItem("july"));
        month.add (aug = new JMenuItem("august"));
        month.add(sep = new JMenuItem("september"));
        month.add(oct = new JMenuItem("october"));
        month.add(nov = new JMenuItem("november"));
        month.add( dec = new JMenuItem("december"));
        day.add(sun = new JMenuItem("sunday"));
        day.add(mon = new JMenuItem("monday"));
       day.add( tues = new JMenuItem("tuesday"));
        day.add(wed = new JMenuItem("wednesday"));
        day.add(thur = new JMenuItem("thursday"));
        day.add(fri = new JMenuItem("friday"));
        day.add(sat = new JMenuItem("saturday"));
        mb.add(month);
        mb.add(day);
       // c.add(mb);
        this.setJMenuBar(mb);
        t1 = new JTextField();
        t1.setBounds(70,10,100,30);
        t2 = new JTextField();
        t2.setBounds(200,10,100,30);
        c.add(t1);
        c.add(t2);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==jan){
            t1.setText("january");
        }
        if(e.getSource()==feb){
            t1.setText("february");
        }
        if(e.getSource()==mar){
            t1.setText("march");
        }
        if(e.getSource()==apr){
            t1.setText("april");
        }
        if(e.getSource()==may){
            t1.setText("may");
        }

        if(e.getSource()==jun){
            t1.setText("june");
        }
        if(e.getSource()==jul){
            t1.setText("july");
        }
        if(e.getSource()==aug){
            t1.setText("august");
        }
        if(e.getSource()==sep){
            t1.setText("september");
        }
        if(e.getSource()==oct){
            t1.setText("october");
        }
        if(e.getSource()==nov){
            t1.setText("november");
        }
        if(e.getSource()==dec){
            t1.setText("december");
        }
        if(e.getSource()==sun){
            t2.setText("sunday");
        }
        if(e.getSource()==mon){
            t2.setText("monday");
        }
        if(e.getSource()==tues){
            t2.setText("tuesday");
        }
        if(e.getSource()==wed){
            t2.setText("wednesday");
        }
        if(e.getSource()==thur){
            t2.setText("thursday");
        }
        if(e.getSource()==fri){
            t2.setText("friday");
        }
        if(e.getSource()==sat){
            t2.setText("saturday");
        }

    }
}

class drivermb{
    public static void main(String[] args) {
        jMenubar f = new jMenubar();
        f.setBounds(100,100,700,700);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
