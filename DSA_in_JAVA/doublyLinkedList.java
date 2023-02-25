
/*
*  Java programs to perform doubly linked list...
 * */

package com.dsa_java;

public class doublyLinkedList {
    node head = null;
    class node{
        node next;
        node prev;
        int data;
        node(int data){
            this.data = data;
        }
    }
    public void insertBeg(int data){
        node newNode = new node(data);
        if(head == null){
            newNode.prev =  null;
            newNode.next = null;
            head = newNode;
        }
        newNode.next = head;
        head.prev = newNode;
        head.next = null;
    }

    public void insertEnd(int data){
        node newNode = new node(data);
        if(head == null){
            newNode.next = null;
            newNode.prev = null;
            head = newNode;
        }
        node last = head;
        while(last.next!= null){
            last = last.next;
        }
        last.next = newNode;
        newNode.prev = last;
        newNode.next = null;
    }
    public void insertBefore(node b,int data){
        node newNode  = new node(data);
        if(b == null){
            System.out.println("b cannot be null");
            return;
        }
        newNode.next = b;
        newNode.prev = b.prev;
        b.prev = newNode;
        if(newNode.prev != null){
            newNode.prev.next = newNode;
        }
    }
    public void insertAfter(node b,int data){
        node newNode = new node(data);
        if(b == null){
            System.out.println("b cannot be null");
            return;
        }
        newNode.next = b.next;
        b.next = newNode;
        newNode.prev = b;
        if(newNode.next!=null){
            newNode.next.prev = newNode;
        }
    }
    public void printList(){
        node last = head;
        while(last!=null)
        {
            System.out.print(last.data+" ");
            last = last.next;
        }
    }
}
class sol{
    public static void main(String[] args) {
        //node head ;
        doublyLinkedList d = new doublyLinkedList();
        d.insertBeg(2);
        d.insertAfter(d.head.next,3);
        d.insertBefore(d.head.next,6);
        d.insertEnd(4);
        d.insertEnd(7);
        d.printList();
    }

}

