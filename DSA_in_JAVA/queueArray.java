
/*
*   Java programs to implement queue using array....
* */

package com.dsa_java;


import java.util.Scanner;

public class queueArray {
 int size;
 int arr[];
 int rear = -1;
 public queueArray(int n)
 {
     arr =  new int [n];
     size = n;
 }
 public void enqueue(int data)
 {
     if(rear == size-1) {
         System.out.println("overflow");
         return;
     }
     rear++;
     arr[rear]  = data;
     System.out.println("the queue is: ");
     for(int i = 0;i<=rear;i++)
     {
         System.out.print(arr[i] + " ");
     }
 }
 public int dequeue() {
     int front;
     if (rear == -1)
         System.out.println("underflow");
     front = arr[0];
     for (int i = 0; i < rear - 1; i++) {
         arr[i] = arr[i + 1];
     }
     rear--;
     return front;
 }
 public int peekFront()
 {
     if(rear == -1) {

         return -1;
     }
     return arr[0];
 }
}
class solQ{
    public static void main(String[] args) {
        int n,ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size: ");
        n = sc.nextInt();
        int arr[] = new int [n];

        queueArray q = new queueArray(n);
        do{
            System.out.println("1.enqueue\n2.dequeue\n3.peek\n4.exit");
            System.out.println("enter the choice: ");
             ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("enter the elemnents: ");
                    int data = sc.nextInt();
                  q.enqueue(data);
                  break;
                case 2:
                    int x = q.dequeue();
                    System.out.println(x);
                    break;
                case 3:
                    int y = q.peekFront();
                    System.out.println(y);
                    break;
//                case 4:
//                    q.display();
//                    break;
                case 4:
                    System.out.println("exit");
            }
        }while(ch!=4);
    }
}
