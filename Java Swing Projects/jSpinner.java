
/*
*    Java swing program to implement the concept of JSpinner ....
* */

package com.java_swing_by_swaraj;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class jSpinner extends JFrame implements ChangeListener {
    String [] arr ={"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
    JSpinner s1,s2,s3;
    SpinnerModel m1,m2,m3;
    JLabel label = new JLabel();
    int date,year;
    String month;
    public jSpinner(){
        setLayout(null);
        setSize(400,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        String str = String.valueOf(java.time.Year.now());
        int y = Integer.parseInt(str);
        m1 = new SpinnerNumberModel(1,1,31,1);
        m2 = new SpinnerListModel(arr);
        m3 = new SpinnerNumberModel(y,y-100,y,1);

        s1 = new JSpinner(m1);
        s2 = new JSpinner(m2);
        s3 = new JSpinner(m3);

        s1.setBounds(10,30,50,30);
        s2.setBounds(90,30,50,30);
        s3.setBounds(170,30,50,30);
        add(s1);
        add(s2);
        add(s3);
        s1.addChangeListener(this);
        s2.addChangeListener(this);
        s3.addChangeListener(this);

        label.setBounds(20,50,120,30);
        setDOB();
        add(label);
        validate();
    }

    public static void main(String[] args) {
        new jSpinner();
    }

    public void setDOB(){
         date = (Integer)s1.getValue();
        year = (Integer)s3.getValue();
        month = (String)s2.getValue();
        label.setText("DOB is: " + date + "-" + month + "-" + year);
    }
    public void  stateChanged (ChangeEvent e){
        setDOB();
    }
}
