
/*
*    Java swing program to create a registration form....
* */


package com.java_swing_by_swaraj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class P3_registrationForm {
    public static void main(String[] args) {
        registrationForm rf = new registrationForm();
        rf.setTitle("registration form");
        rf.setLayout(null);
        rf.setBounds(100,100,900,900);
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rf.setVisible(true);
    }
}

class registrationForm extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,lm,lg;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,tm;
    JTextArea ta1,ta2;
    JButton b;
    JCheckBox cb;
    JRadioButton b1,b2,b3;
    Container c ;
    public registrationForm(){
        c = this.getContentPane();

        l1 = new JLabel(" Student Name: ");
        l1.setBounds(10,40,100,20);
        c.add(l1);
        t1 = new JTextField();
        t1.setBounds(150,40,150,20);
        c.add(t1);

        l2 = new JLabel(" college Name: ");
        l2.setBounds(10,80,100,20);
        c.add(l2);
        t2 = new JTextField();
        t2.setBounds(150,80,150,20);
        c.add(t2);


        l3 = new JLabel(" Father's Name: ");
        l3.setBounds(10,120,100,20);
        c.add(l3);
        t3 = new JTextField();
        t3.setBounds(150,120,150,20);
        c.add(t3);


        l4 = new JLabel(" Mother's Name: ");
        l4.setBounds(10,160,100,20);
        c.add(l4);
        t4 = new JTextField();
        t4.setBounds(150,160,150,20);
        c.add(t4);


        l5 = new JLabel(" Department Name: ");
        l5.setBounds(10,200,120,20);
        c.add(l5);
        t5 = new JTextField();
        t5.setBounds(150,200,150,20);
        c.add(t5);

        lm= new JLabel("Student contact no:");
        lm.setBounds(310,200,140,20);
        c.add(lm);
        tm = new JTextField();
        tm.setBounds(440,200,100,20);
        c.add(tm);

        l6 = new JLabel("student's address:");
        l6.setBounds(10,260,130,20);
        c.add(l6);

        l7 = new JLabel("city name:");
        l7.setBounds(150,260,70,20);
        c.add(l7);
        t7 = new JTextField();
        t7.setBounds(230,260,90,20);
        c.add(t7);

        l8 = new JLabel("district:");
        l8.setBounds(330,260,100,20);
        c.add(l8);
        t8 = new JTextField();
        t8.setBounds(390,260,100,20);
        c.add(t8);

        l9 = new JLabel("State:");
        l9.setBounds(500,260,80,20);
        c.add(l9);
        t9 = new JTextField();
        t9.setBounds(550,260,120,20);
        c.add(t9);

        l10 = new JLabel("Nationality:");
        l10.setBounds(680,260,80,20);
        c.add(l10);
        t10 = new JTextField();
        t10.setBounds(770,260,100,20);
        c.add(t10);

        lg = new JLabel("student's gender:");
        lg.setBounds(330,40,120,20);
        c.add(lg);

        b1 = new JRadioButton("Male");
        b1.setBounds(450,40,60,20);
        c.add(b1);

        b2 = new JRadioButton("Female");
        b2.setBounds(520,40,80,20);
        c.add(b2);

        b3 = new JRadioButton("Other");
        b3.setBounds(600,40,70,20);
        c.add(b3);

        ButtonGroup btn = new ButtonGroup();
        btn.add(b1);
        btn.add(b2);
        btn.add(b3);

        cb = new JCheckBox();
        cb.setText("I agree that the details are filled correctly.");
        cb.setBounds(200,400,300,30);
        c.add(cb);

        b = new JButton("Submit");
        b.setBounds(280,450,80,30);
        c.add(b);
        b.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e){
        System.out.println("student name:" +t1.getText());
        System.out.println("college name:" +t2.getText());
        System.out.println("Father's name:" +t3.getText());
        System.out.println("Mother's name:" +t4.getText());
        System.out.println("Department name:" +t5.getText());

        System.out.println("city:" +t7.getText());
        System.out.println("District:" +t8.getText());
        System.out.println("State:" +t9.getText());
        System.out.println("Nationality:" +t10.getText());
       if(e.getSource() == b1){
           System.out.println("student's gender:" +b1.getText());
       }
       else if(e.getSource()== b2){
           System.out.println("student's gender:" +b2.getText());
       }
       else if(e.getSource()==b3){
           System.out.println("student's gender:" +b3.getText());
       }
        System.out.println("student's contact no:" +tm.getText());
    }
}
