
/*
*  Java programs to perform linked queue...
 * */

package com.dsa_java;

public class linkedQueue {
    node front,rear;
    class node
    {
        int data ;
        node next;
        node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public void enqueue(int data)
    {
        node newNode = new node(data);
        if(rear == null)
        {
           front = rear = newNode;
           return;
        }
        rear.next = newNode;
        rear = rear.next;
    }
    public int dequeue()
    {
        if(front == null)
        {
            return -1;
        }
        if(front == rear)
            return front.data;
        int temp = front.data;
        front  = front.next;
        return temp;
    }
    public void print()
    {
        node ptr = front;
        while(ptr!=null)
        {
            System.out.println(ptr.data);
            ptr = ptr.next;
        }
    }

}
class linkQ
{
    public static void main(String[] args) {
        linkedQueue lq  =new linkedQueue();
        lq.enqueue(1);
        lq.enqueue(2);
        lq.enqueue(3);
        lq.enqueue(4);
        lq.enqueue(5);
        lq.print();
        int x = lq.dequeue();
        int y = lq.dequeue();
        System.out.println("the dequeued data are: " + x + " " +y);
        lq.print();
    }
}
