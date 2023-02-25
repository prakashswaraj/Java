
/*
*   Java programs to perform circular queue...
 * */

package com.dsa_java;

import java.util.Scanner;

public class circularQueue {
    int front = -1 ,rear = -1;
    int arr[];
    int size;
    public circularQueue(int n)
    {
         arr = new int [n];
        this.size = n;
    }
//    public boolean isEmpty()
//    {
//        return  rear == -1 && front == -1;
//    }
//    public boolean isFull()
//    {
//        return (rear + 1) % size == front;
//    }
    public void enqueue(int data)
    {
//        if(isFull())
        if((rear+1)%size == front)
        {
            System.out.println("overflow");
            return;
        }
        if(front == -1)//queue is totally empty
            front =0;
        rear = (rear+1) % size;
        arr[rear] = data;
    }
    public int dequeue()
    {
       // if(isEmpty())
        if(rear == -1 && front ==-1)
        {
            System.out.println("underflow");
            return -1;
        }
        if(rear == front)//only one element is there
            rear = front = -1;
        int temp = arr[front];
        front = (front+1)%size;
        return temp;
    }
    public int peek()
    {
       // if(isEmpty())
        if(rear == -1 && front ==-1)
        {
            return -1;
        }
        return arr[front];
    }
}
class cirQ
{
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.println("enter the size of the array: ");
//        int n = s.nextInt();
        circularQueue q = new circularQueue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
      //  q.enqueue(4);
        while(!(q.rear == -1 && q.front == -1))
        {
            System.out.println(q.peek());
            q.dequeue();
        }
    }
}
