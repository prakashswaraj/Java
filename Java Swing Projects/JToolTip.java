

/*
*        Java swing program to implement the concept of JTooltip...
* */

package com.java_swing_by_swaraj;

import javax.swing.*;

public class JToolTip extends JFrame {
    public JToolTip() {
       setLayout(null);
       setSize(300,300);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setVisible(true);
       JLabel l = new JLabel();
       l.setText("password");
       l.setBounds(10,30,80,30);
       add(l);

       JPasswordField pwd = new JPasswordField();
       pwd.setBounds(120,30,100,30);
       add(pwd);

       //JToolTip tp = new JToolTip();
      // pwd.setToolTipText("enter the password: ");
        String str = "<html>"+"enter the password<br/>"+"password length 8"+"</html>";
        pwd.setToolTipText(str);
       validate();
    }

    public static void main(String[] args) {
        new JToolTip();
    }
}
