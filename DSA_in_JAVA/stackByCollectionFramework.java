
/*
*     Java programs to implement stack collection framework..
 * */

package com.dsa_java;

import java.util.Stack;

public class stackByCollectionFramework {
    public static void main(String[] args) {
        int size = 0;
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);


        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
            size++;
        }
        System.out.println( "the size of the stack is: " +size);
    }
}
