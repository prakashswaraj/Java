
/*
*   Java programs to perform list of stack...
 * */

package com.dsa_java;

public class listOfStack {
    public static node head;
    public static class node {
        int data;
        node next;
             node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static boolean isEmpty(){
        return head == null;
    }
    public static void push(int data){
        node newnode = new node(data);
        if(isEmpty()){
           head = newnode;
           return;
        }
        newnode.next = head;
        head = newnode;

    }
    public static int pop() {
        //int top = head.data;
        if (isEmpty())
            return -1;
        int top = head.data;
        head = head.next;
        return top;
    }
    public static int peek(){
        if(isEmpty())
            return -1;
        int top = head.data;
        return top;
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
        System.out.println(pop());
        //pop();
        System.out.println(peek());
    }
}
