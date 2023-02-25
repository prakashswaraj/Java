
/*
*  Java programs to find the middle of the linked list...
 * */

package com.dsa_java;

public class mid {
    node head;
    class node{
         int data;
         node next;
         node(int data){
             this.data = data;
             this.next = null;
         }
    }
    public void addFirst(int data){
        node newnode  = new node(data);
        if( head  == null){
            head = newnode;
            //return head;
        }
        newnode.next = head;
        head= newnode;
       // return head;
    }
    public void print(){
        if(head == null){
            System.out.println("list is empty");
           // return head;
        }
        node curr  = head;
        while(curr!= null){
            System.out.println(curr.data + "->");
            curr = curr.next;
        }
       // return head;
    }

    public static void main(String[] args) {
        mid m = new mid();
        m.addFirst(2);
        m.addFirst(3);
        m.addFirst(4);
        m.addFirst(5);
        m.print();
    }
}
