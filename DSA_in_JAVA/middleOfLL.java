/*
*   Java programs to find middle of the linked list ...
 * */

package com.dsa_java;

public class middleOfLL {
    Node head = null;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public int getMiddle(Node head){
        int size = 0;
        int n;
        if(head == null){
            return -1;
        }
        Node ptr = head;
        while(ptr!=null){
            ptr = ptr.next;
            size++;
        }
        Node x  = head;
        int y = x.data;
        if(size%2==1){
            n = (size+1)/2;

            while((n-1)!=0){
               x = x.next;
               n--;
            }
            y =  x.data;
        }
        if(size%2==0){
            n = size/2;
            while(n!=0){
                x = x.next;
                n--;
            }
            y = x.data;
        }
        return y;
    }
}
class solution123{
    public static void main(String[] args) {

        middleOfLL ll = new middleOfLL();
        int z  =ll.getMiddle(ll.head);
    }
}
