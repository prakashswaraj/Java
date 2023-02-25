
/* Java code for checking the balanced parenthesis using stack collection framework
*/
package com.java_gfgs;

import javax.swing.*;
import java.util.Stack;

public class parenthesisMatching {
        public  static boolean checkParen(String str )
        {
            Stack<Character> s = new Stack<>();
            for(int i = 0;i<str.length();i++)
            {
                char c = str.charAt(i);
                if(isOpening(c))
                    s.push(c);
                else
                {
                    if (s.isEmpty())
                        return false;
                    else if(!isMatching(s.peek(),c))
                    {
                        return false;
                    }
                    else
                        s.pop();
                }
            }
                return s.isEmpty();
        }
        public static boolean isOpening(char ch)
        {
            if (ch=='('||ch == '{' || ch == '[')
            {
                return true;
            }
                return false;
        }
        public static boolean isMatching(char a,char b)
        {
            if (a=='(' && b== ')'|| a =='{' && b == '}' && a == '[' && b ==']' )
                return true;
            return false;
        }
    public static void main(String[] args) {
            String expr = "({[]})";
     if(checkParen(expr))
         System.out.println("balanced");
     else
         System.out.println("not balanced");
    }

}

