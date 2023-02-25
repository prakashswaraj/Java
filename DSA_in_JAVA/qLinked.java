
/*
*   Java programs to perform queue using linked list...
 * */

package com.dsa_java;

public class qLinked {
    node head, tail;
    class node
    {
        int data;
        node next;
        public node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public boolean isEmpty()
    {
        if(head == null && tail == null)
            return true;
        return false;
    }
    public void enqueue(int data)
    {
        node newNode  = new node(data);
        if(tail  == null)
        {
            tail = head = newNode;
            return;
        }
        tail.next = newNode;
        tail = tail.next;
    }
    public int dequeue()
    {
       if(isEmpty())
           return -1;
       int temp = head.data;
       if(head == tail)
           tail = null;
       head = head.next;
       return temp;
    }
    public int peek()
    {
        if(isEmpty())
            return -1;
        return head.data;
    }
}
class q
{
    public static void main(String[] args) {
        qLinked ql = new qLinked();
        ql.enqueue(1);
        ql.enqueue(2);
        ql.enqueue(3);
        ql.enqueue(4);
        while(!ql.isEmpty())
        {
            System.out.println(ql.peek());
            ql.dequeue();
        }
        System.out.println(ql.dequeue());
        System.out.println(ql.dequeue());
        System.out.println(ql.peek());
    }
}
