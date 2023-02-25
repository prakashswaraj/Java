

/*
*   Java programs to perform array of stack....
* */

package com.dsa_java;

import java.util.ArrayList;

public class arrayOfStack {
    static ArrayList<Integer> list = new ArrayList<>();
    public static boolean isEmpty(){
        return list.size() == 0;
    }
    public  static void push(int data) {
        list.add(data);
    }
    public static int pop(){
        if(isEmpty()){
            return -1;
        }
        return list.remove(list.size()-1);
    }
    public static  int peek(){
        if(isEmpty()){
            return -1;
        }
        return list.get(list.size()-1);
    }

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);
        while(!isEmpty()){
            System.out.println(peek());
            pop();
        }
    }
}
