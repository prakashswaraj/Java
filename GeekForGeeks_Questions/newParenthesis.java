
/*
    Java code for checking the parenthesis are balanced or not.
 */

package com.java_gfgs;
import java.util.*;
public class newParenthesis {

// Java program for checking
// balanced brackets


        // function to check if brackets are balanced
        static boolean areBracketsBalanced(String expr)
        {
            // Using ArrayDeque is faster than using Stack class
            Stack<Character> st
                    = new Stack<>();

            // Traversing the Expression
            for (int i = 0; i < expr.length(); i++) {
                char x = expr.charAt(i);

                if (x == '(' || x == '[' || x == '{') {
                    // Push the element in the stack
                    st.push(x);
                    continue;
                }

                // If current character is not opening
                // bracket, then it must be closing. So stack
                // cannot be empty at this point.
                if (st.isEmpty())
                    return false;
                char check;
                switch (x) {
                    case ')':
                        check = st.pop();
                        if (check == '{' || check == '[')
                            return false;
                        break;

                    case '}':
                        check = st.pop();
                        if (check == '(' || check == '[')
                            return false;
                        break;

                    case ']':
                        check = st.pop();
                        if (check == '(' || check == '{')
                            return false;
                        break;
                }
            }

            // Check Empty Stack
            return (st.isEmpty());
        }

        // Driver code
        public static void main(String[] args)
        {
            String expr = "([{}])])";

            // Function call
            if (areBracketsBalanced(expr))
                System.out.println("Balanced ");
            else
                System.out.println("Not Balanced ");
        }
    }

